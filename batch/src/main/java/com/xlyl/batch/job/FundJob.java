package com.xlyl.batch.job;

import com.xlyl.batch.feign.FundFeign;
import jakarta.annotation.Resource;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释 自动生成每日的火车数据
 */
@DisallowConcurrentExecution//增加这个注解,可以关闭并发执行,只有完成上个任务才会进行下一步
public class FundJob implements Job {
    private static final Logger LOG = LoggerFactory.getLogger(FundJob.class);

    @Resource
    private FundFeign fundFeign;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {

        LOG.info("生成基金的数据开始...");
        fundFeign.genFund();
        LOG.info("生成基金的数据完成...");

    }
}
