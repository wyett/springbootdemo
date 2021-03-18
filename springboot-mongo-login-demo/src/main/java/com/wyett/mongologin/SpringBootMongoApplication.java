package com.wyett.mongologin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/18 9:23
 * @description: TODO
 */

@SpringBootApplication
public class SpringBootMongoApplication implements CommandLineRunner {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBootMongoApplication.class, args);
        String[] beans = ctx.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans) {
            System.out.println(bean);
        }
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("spring boot mongo login application");
    }
}
