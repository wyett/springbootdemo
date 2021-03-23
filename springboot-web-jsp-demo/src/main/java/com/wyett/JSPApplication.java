package com.wyett;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/1 17:13
 * @description: TODO
 */

@SpringBootApplication
public class JSPApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(JSPApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("jsp demo");
    }
}
