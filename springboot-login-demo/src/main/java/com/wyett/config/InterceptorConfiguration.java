package com.wyett.config;

import com.wyett.config.properties.NoAuthUrlProperties;
import com.wyett.interceptor.AuthInterceptorHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/15 11:05
 * @description: TODO
 */

@EnableConfigurationProperties(NoAuthUrlProperties.class)
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {

    @Autowired
    private NoAuthUrlProperties noAuthUrlProperties;


    /**
     * 将过滤规则，和排除规则加入interceptor注册中心
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authInterceptorHandler())
                .addPathPatterns("/**")
                .excludePathPatterns(new ArrayList<>(noAuthUrlProperties.getShouldSkipUrls()));
    }

    @Bean
    public AuthInterceptorHandler authInterceptorHandler() {
        return new AuthInterceptorHandler();
    }
}
