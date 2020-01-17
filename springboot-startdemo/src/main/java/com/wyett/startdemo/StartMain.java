package com.wyett.startdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author : wyettLei
 * @date : Created in 2020/1/17 11:48
 * @description: TODO
 */

@SpringBootApplication
public class StartMain extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(StartMain.class, args);
    }

    @Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(StartMain.class);
    }

}
