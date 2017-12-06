package com.lingyuntec.framework.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by xieyuxing on 2017/9/19.
 */
@Configuration
@ComponentScan(basePackages = {"contacts","com.lingyuntec.framework.config"})
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
