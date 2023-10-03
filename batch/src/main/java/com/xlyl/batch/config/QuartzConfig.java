package com.xlyl.batch.config;
import com.xlyl.batch.job.FundJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
@Configuration
public class QuartzConfig {

    /**
     * 声明一个任务
     *
     * @return
     */
    @Bean
    public JobDetail jobDetail() {
        return JobBuilder.newJob(FundJob.class)
                .withIdentity("FundJob", "fund")
                .storeDurably()
                .build();
    }
    /**
     * 声明一个触发器，什么时候触发这个任务
     * 每天早上8点30
     * @return
     */
    @Bean
    public Trigger trigger() {
        return TriggerBuilder.newTrigger()
                .forJob(jobDetail())
                .withIdentity("trigger", "trigger")
                .startNow()
                .withSchedule(CronScheduleBuilder.cronSchedule("0 30 8 ? * *"))
                .build();
    }

}
