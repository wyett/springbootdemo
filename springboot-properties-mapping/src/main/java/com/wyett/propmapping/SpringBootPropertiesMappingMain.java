package com.wyett.propmapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2020/1/19 10:15
 * @description: TODO
 */

@SpringBootApplication
@EnableConfigurationProperties(Person.class)
@RestController
public class SpringBootPropertiesMappingMain {

    @Autowired
    private Person person;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPropertiesMappingMain.class, args);
    }

    @RequestMapping("/getPerson")
    public Person getPerson() {
        return person;
    }
}
