package com.wyett.binlogFilter.config;

import com.wyett.binlogFilter.filter.BinlogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/3 11:57
 * @description: TODO
 */

@Configuration
public class BinlogConfig {

    @Bean
    public FilterRegistrationBean<BinlogFilter> filterRegistrationBean() {
        FilterRegistrationBean<BinlogFilter> filterBean = new FilterRegistrationBean<>();
        filterBean.setFilter(new BinlogFilter());
        filterBean.addUrlPatterns("/*");
        return filterBean;
    }

    
}
