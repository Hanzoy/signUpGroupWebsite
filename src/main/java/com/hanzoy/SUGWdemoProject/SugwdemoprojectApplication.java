package com.hanzoy.SUGWdemoProject;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@Slf4j
@SpringBootApplication
@MapperScan("com.hanzoy.SUGWdemoProject.mapper")
public class SugwdemoprojectApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SugwdemoprojectApplication.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();
        log.info("项目以运行在 http://127.0.0.1:{}",environment.getProperty("server.port"));
    }

}
