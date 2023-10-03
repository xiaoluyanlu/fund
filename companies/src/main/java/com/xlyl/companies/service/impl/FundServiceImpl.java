package com.xlyl.companies.service.impl;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ObjUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xlyl.common.req.PageReq;
import com.xlyl.common.resp.PageResp;
import com.xlyl.common.util.SnowUtil;
import com.xlyl.companies.domain.Fund;
import com.xlyl.companies.domain.FundExample;
import com.xlyl.companies.domain.FundNetVal;
import com.xlyl.companies.mapper.FundMapper;
import com.xlyl.companies.resp.FundResp;
import com.xlyl.companies.service.FundNetValService;
import com.xlyl.companies.service.FundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
@Service
public class FundServiceImpl implements FundService {

    private static final Logger LOG = LoggerFactory.getLogger(FundServiceImpl.class);

    @Autowired
    FundNetValService fundNetValService;

    @Autowired
    FundMapper fundMapper;

    /**
     * 分页查询基金列表
     * pageNum 页数 必填
     * pageSize  每页条数 必填
     * sortField 排序字段 必填 默认按照单位净值顺序排序
     * sortDirection 排序方向 升序还是降序 必填
     *
     * @return
     */
    @Override
    public PageResp<FundResp> selPageFund(PageReq req) {
        //校验框架校验是否为空
        //排序字段
        //第几页
        Integer pageNum = req.getPageNum();
        //每页显示条数
        Integer pageSize = req.getPageSize();
        //排序字段
        String sortField = req.getSortField();
        //升序还是降序
        String sortDirection = req.getSortDirection();
        FundExample fundExample = new FundExample();
        //排序
        fundExample.setOrderByClause(sortField + " " + sortDirection);

        //分页插件
        LOG.info("查询页码: {}", pageNum);
        LOG.info("每页条数: {}",pageSize);
        PageHelper.startPage(pageNum, pageSize);
        List<Fund> fundList = fundMapper.selectByExample(fundExample);

        PageInfo<Fund> fundPageInfo = new PageInfo<>(fundList);
        LOG.info("总行数: {}", fundPageInfo.getTotal());
        LOG.info("总页数: {}", fundPageInfo.getPages());

        List<FundResp> fundRespList = BeanUtil.copyToList(fundList, FundResp.class);
        PageResp<FundResp> pageResp = new PageResp<>();
        pageResp.setTotal(fundPageInfo.getTotal());
        pageResp.setList(fundRespList);
        return pageResp;

    }


    /**
     * 定时生成基金信息
     */
    @Override
    public void genFund() {
        LOG.info("开始生成基金信息...");
        //当前时间
        Date date = new Date();
        //获取从xlsx中的到的每日的基金信息
        List<FundNetVal> allFundNetVal = fundNetValService.getAllFundNetVal();

        //使用stream流对集合进行分组,按 fund_code
        Map<String, List<FundNetVal>> map = allFundNetVal.stream()
                .filter(fundNetVal -> fundNetVal.getUnitNetVal() != null && fundNetVal.getFundCode() != null
                        && fundNetVal.getFundShortName() != null && fundNetVal.getEndDate() != null
                )
                .collect(Collectors.groupingBy(FundNetVal::getFundCode));
        //循环每个组,时间最早为发行时间,时间最晚的,作为单位净值
        map.forEach((key, fundNetValList) -> {
            List<FundNetVal> collect = fundNetValList.stream().distinct()
                    .sorted(Comparator.comparing(FundNetVal::getEndDate)).collect(Collectors.toList());
            //发行最早的时间
            FundNetVal fundNetValStart = collect.get(0);
            LOG.info("生成基金: {}", fundNetValStart.getFundCode());
            Date endDate = fundNetValStart.getEndDate();
            Fund fund = new Fund();
            fund.setId(SnowUtil.getSnowflakeNextId());
            fund.setFundCode(fundNetValStart.getFundCode());
            fund.setFundShortName(fundNetValStart.getFundShortName());
//            fund.setCountDate(DateUtil.format(date,"yyyy-MM-dd"));
            fund.setCountDate(date);
            fund.setEndDate(endDate);

            //单位净值,去找时间最晚的
            FundNetVal fundNetValEnd = collect.get(collect.size() - 1);
            BigDecimal unitNetVal = fundNetValEnd.getUnitNetVal();
            fund.setUnitNetVal(unitNetVal.setScale(2, BigDecimal.ROUND_HALF_UP));

            //累计净值
            OptionalDouble average = collect.stream()
                    .map(fundNetVal -> fundNetVal.getUnitNetVal()).mapToDouble(BigDecimal::doubleValue).average();
            fund.setAccumulateNetVal(BigDecimal.valueOf(average.getAsDouble()).setScale(2, BigDecimal.ROUND_HALF_UP));

            //获取近一天的(有效发行日的)
            BigDecimal bigDecimalDailyGrowthRate = getNetVal(date, collect, fund, unitNetVal, 1);
            //添加日增长率(涨跌幅)
            fund.setDailyGrowthRate(bigDecimalDailyGrowthRate);

            //获取近一周的(有效发行日的)
            BigDecimal bigDecimalWeek = getNetVal(date, collect, fund, unitNetVal, 7);
            //添加近一周的涨跌幅
            fund.setOneWeek(bigDecimalWeek);

            //获取近一月的(有效发行日的)
            BigDecimal bigDecimalOneMonth = getNetVal(date, collect, fund, unitNetVal, 30);
            //添加近一月的涨跌幅
            fund.setOneMonth(bigDecimalOneMonth);

            //获取近三个月的(有效发行日的)
            BigDecimal bigDecimalThreeMonth = getNetVal(date, collect, fund, unitNetVal, 90);
            //添加近三个月的涨跌幅
            fund.setThreeMonth(bigDecimalThreeMonth);

            //获取近一年的(有效发行日的)
            BigDecimal bigDecimalOneYear = getNetVal(date, collect, fund, unitNetVal, 365);
            //添加近一年的涨跌幅
            fund.setOneYear(bigDecimalOneYear);

            //获取近两年的(有效发行日的)
            BigDecimal bigDecimalTwoYear = getNetVal(date, collect, fund, unitNetVal, 365 * 2);
            //添加近两年的涨跌幅
            fund.setTwoYear(bigDecimalTwoYear);

            //获取近三年的(有效发行日的)
            BigDecimal bigDecimalThreeYear = getNetVal(date, collect, fund, unitNetVal, 365 * 3);
            //添加近三年的涨跌幅
            fund.setThreeYear(bigDecimalThreeYear);

            //获取今年来的(有效发行日的)
            BigDecimal bigDecimalSinceThisYear = getNetVal(date, collect, fund, unitNetVal, DateUtil.dayOfYear(date));
            //添加今年来的涨跌幅
            fund.setSinceThisYear(bigDecimalSinceThisYear);

            //获取成立来的(有效发行日的)
            BigDecimal bigDecimalSinceTheEstablishmentOf = getNetVal(date, collect, fund, unitNetVal, (int) DateUtil.betweenDay(endDate, date, true));
            //添加成立来的涨跌幅
            fund.setSinceTheEstablishmentOf(bigDecimalSinceTheEstablishmentOf);

            fundMapper.insertSelective(fund);
            LOG.info("基金信息为: {}", fund);
        });
        LOG.info("基金信息生成完毕...");
    }

    /**
     * 获取涨跌幅
     *
     * @param date
     * @param collect
     * @param fund
     * @param unitNetVal
     * @param day
     * @return
     */
    private static BigDecimal getNetVal(Date date, List<FundNetVal> collect, Fund fund, BigDecimal unitNetVal, int day) {
        //如果时间不存在,就往前推时间,推到上星期五工作日
        DateTime dateTime = getDateTime(date, day);
        //根据最近的有效时间,计算各时间段涨跌幅
        BigDecimal bigDecimal = getDecimal(collect, fund, unitNetVal, dateTime);
        return bigDecimal;
    }

    /**
     * 根据当前日期找到最近的有效日期
     *
     * @param date
     * @return
     */
    private static DateTime getDateTime(Date date, int day) {
        DateTime dateTime = DateUtil.offsetDay(date, -day);
        int weekNum = DateUtil.dayOfWeek(dateTime);
        if (weekNum == 1) {
            //周日
            dateTime = DateUtil.offsetDay(dateTime, 2);
        } else if (weekNum == 7) {
            //周六
            dateTime = DateUtil.offsetDay(dateTime, 1);
        }
        return dateTime;
    }

    /**
     * 根据有效发行日期,计算各时间段的涨跌幅
     *
     * @param collect
     * @param fund
     * @param unitNetVal
     * @param dateTime
     * @return
     */
    private static BigDecimal getDecimal(List<FundNetVal> collect, Fund fund, BigDecimal unitNetVal, DateTime dateTime) {
        List<FundNetVal> fundNetValList = collect.stream().filter(fundNetVal -> DateUtil.betweenDay(fundNetVal.getEndDate(), dateTime, true) == 0).collect(Collectors.toList());
        if (CollUtil.isNotEmpty(fundNetValList)) {
            BigDecimal unitNetValDB = fundNetValList.get(0).getUnitNetVal();
            //BigDecimal 的减subtract  的乘multiply  的除divide  保留小数,四舍五入
            BigDecimal bigDecimal = unitNetVal.subtract(unitNetValDB).multiply(BigDecimal.valueOf(100)).divide(unitNetValDB, 2, BigDecimal.ROUND_HALF_UP);
            return bigDecimal;
        } else {
            //数据有缺失,找不到指定日期的数据
            LOG.error("数据有缺失,找不到指定日期的数据,赋值为0: {}", dateTime);
            return new BigDecimal("0");
        }
    }

}
