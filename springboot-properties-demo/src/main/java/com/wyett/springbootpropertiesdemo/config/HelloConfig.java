package com.wyett.springbootpropertiesdemo.config;

import com.wyett.springbootpropertiesdemo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : wyettLei
 * @date : Created in 2019/11/5 17:48
 * @description: TODO
 */

@Configuration
public class HelloConfig {
    @Bean
    public HelloService helloService() {
        System.out.println("@bean代替<bean>");
        return new HelloService();
    }
}
