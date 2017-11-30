package com.lingyuntec.framework.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by xieyuxing on 2017/11/30.
 */
@Configuration
public class DataSourceConfiguration {
//    @Profile("qa")
    @Bean
    @Conditional(IsDevelopmentEnvironment.class)
    public DataSource developDataSource(){
        BasicDataSource dataSource=new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/sys");
        dataSource.setUsername("root");
        System.out.println("开发环境数据源创建完成");
        return dataSource;
    }
}
