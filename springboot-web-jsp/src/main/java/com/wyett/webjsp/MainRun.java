package com.wyett.webjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author : wyettLei
 * @date : Created in 2020/1/17 18:25
 * @description: TODO
 */

@SpringBootApplication
public class MainRun extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(MainRun.class, args);
    }

    @Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(MainRun.class);
    }
}
