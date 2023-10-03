package com.xlyl.companies.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.StrUtil;
import com.xlyl.common.exception.CompaniesException;
import com.xlyl.common.exception.CompaniesExceptionEnum;
import com.xlyl.common.resp.CommonResp;
import com.xlyl.common.util.SnowUtil;
import com.xlyl.companies.domain.Companies;
import com.xlyl.companies.domain.CompaniesExample;
import com.xlyl.companies.mapper.CompaniesMapper;
import com.xlyl.companies.req.CompaniesReq;
import com.xlyl.companies.resp.CompaniesResp;
import com.xlyl.companies.service.CompaniesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
@Service
public class CompaniesServiceImpl implements CompaniesService {

    private static final Logger LOG = LoggerFactory.getLogger(CompaniesServiceImpl.class);


    @Autowired
    CompaniesMapper companiesMapper;

    /**
     * 查询出所有的热门企业 按照时间排序 最近创建的排在前面
     *
     * @return
     */
    @Override
    public List<CompaniesResp> getAllHotCompanies() {
        CompaniesExample companiesExample = new CompaniesExample();
        companiesExample.setOrderByClause("org_est_date desc");
        //设置查询条件
        CompaniesExample.Criteria criteria = companiesExample.createCriteria();
        //查询返回结果
        List<Companies> companiesList = companiesMapper.selectByExample(companiesExample);
        //封装结果类
        List<CompaniesResp> companiesRespList = BeanUtil.copyToList(companiesList, CompaniesResp.class);
        LOG.info("查询到的热门企业: {}", companiesRespList);
        return companiesRespList;
    }

    /**
     * 新增或者修改企业
     */
    @Override
    public void addOrUpdCompanies(CompaniesReq req) {
        //校验框架已经校验字段是否为空,是否不合法

        //判断公司id是否为null,不为null,则是更新公司信息
        Long id = req.getId();
        if(ObjUtil.isNotNull(id)){
            //修改公司信息
            Companies companiesDB = companiesMapper.selectByPrimaryKey(id);
            if(ObjUtil.isNull(companiesDB)){
                LOG.error("更新公司信息失败,系统错误");
                throw new RuntimeException();
            }
            Companies companies = BeanUtil.copyProperties(req, Companies.class);
            companiesMapper.updateByPrimaryKeySelective(companies);
            LOG.info("更新公司信息成功");
            return;
        }

        //判断该公司是否存在(通过该字段orgUniCode)
        CompaniesExample companiesExample = new CompaniesExample();
        companiesExample.createCriteria().andOrgUniCodeEqualTo(Long.valueOf(req.getOrgUniCode()));
        List<Companies> companiesList = companiesMapper.selectByExample(companiesExample);
        if (CollUtil.isNotEmpty(companiesList)) {
            LOG.error("添加公司失败,公司已存在,注册号: {}", req.getOrgUniCode());
            //抛异常
            throw new CompaniesException(CompaniesExceptionEnum.COMPANIES_EXIST);
        }

        //添加公司
        Companies companies = BeanUtil.copyProperties(req, Companies.class);
        //工具类生成id
        companies.setId(SnowUtil.getSnowflakeNextId());
        companiesMapper.insertSelective(companies);
        LOG.info("添加公司成功");
    }

    /**
     * 查询指定企业
     *
     * @return
     */
    @Override
    public CompaniesResp getCompaniesById(Long comId) {
        //判断前端的数据是否为空
        if (ObjUtil.isNull(comId)) {
            throw new CompaniesException(CompaniesExceptionEnum.COMPANIES_ID_EMPTY);
        }
        Companies companies = companiesMapper.selectByPrimaryKey(comId);
        if(ObjUtil.isEmpty(companies)){
            throw new CompaniesException(CompaniesExceptionEnum.COMPANIES_ID_NOT_EXIST);
        }
        LOG.info("查询到指定的公司: {}",companies);
        return BeanUtil.copyProperties(companies, CompaniesResp.class);
    }

    /**
     * 根据公司id删除指定企业
     *
     * @return
     */
    @Override
    public void delCompaniesById(Long comId) {
        //判断前端的数据是否为空
        if (ObjUtil.isNull(comId)) {
            throw new CompaniesException(CompaniesExceptionEnum.COMPANIES_ID_EMPTY);
        }
        companiesMapper.deleteByPrimaryKey(comId);
        LOG.info("删除到指定的公司,公司id: {}",comId);
    }


}
