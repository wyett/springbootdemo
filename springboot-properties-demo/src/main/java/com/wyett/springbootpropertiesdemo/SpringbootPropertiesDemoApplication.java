package com.wyett.springbootpropertiesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:helloBeans.xml"})
@SpringBootApplication
public class SpringbootPropertiesDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPropertiesDemoApplication.class, args);
    }

}
