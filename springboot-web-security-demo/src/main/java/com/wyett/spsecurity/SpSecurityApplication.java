package com.wyett.spsecurity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/22 15:29
 * @description: TODO
 */

@SpringBootApplication
public class SpSecurityApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpSecurityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("web security demo");
    }
}
