package com.wyett.logconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author : wyettLei
 * @date : Created in 2020/2/25 15:47
 * @description: TODO
 */

@SpringBootApplication
//@Slf4j
public class SpringBootLogApplication {
    public static void main(String[] args) {
        /*ConfigurableApplicationContext context = SpringApplication.run(SpringBootLogApplication.class, args);
        int length = context.getBeanDefinitionNames().length;
        log.debug("使用了{}个bean", length);*/
        SpringApplication.run(SpringBootLogApplication.class, args);
    }
}
