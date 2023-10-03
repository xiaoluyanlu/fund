package com.xlyl.gen.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */

@SpringBootApplication
@ComponentScan("com.xlyl")
@MapperScan("com.xlyl.gen.mapper")
public class GenApplication {
    private static final Logger LOG= LoggerFactory.getLogger(GenApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GenApplication.class);
        ConfigurableEnvironment env = app.run(args).getEnvironment();
        LOG.info("启动成功!!");
    }
}
