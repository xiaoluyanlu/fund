package com.xlyl.batch.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ComponentScan("com.xlyl")
@EnableFeignClients("com.xlyl.batch.feign")
public class BatchApplication {

    private static final Logger LOG= LoggerFactory.getLogger(BatchApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BatchApplication.class);
        ConfigurableEnvironment env = app.run(args).getEnvironment();
        LOG.info("启动成功!!");
        LOG.info("测试地址: \thttp://127.0.0.1:{}{}",env.getProperty("server.port"),env.getProperty("server.servlet.context-path"));
    }

}
