package com.lingyuntec.framework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/**
 * Created by xieyuxing on 2017/11/30.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.lingyuntec.db")
public class JpaConfiguration {
}
