package com.wyett.staticweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 其中默认配置的 /** 映射到 /static （或/public、/resources、/META-INF/resources）
 * 其中默认配置的 /webjars/** 映射到 classpath:/META-INF/resources/webjars/
 * PS：上面的 static、public、resources 等目录都在 classpath: 下面（例如 src/main/resources/static）。
 *
 * @author : wyettLei
 * @date : Created in 2020/8/31 11:07
 * @description: TODO
 */

@SpringBootApplication
public class StaticWebApp {
    public static void main(String[] args) {
        SpringApplication.run(StaticWebApp.class, args);
    }
}
