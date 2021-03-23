package com.wyett.spthymeleaf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class SpringbootWebThymeleafDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebThymeleafDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("springboot + thymeleaf");
    }
}
