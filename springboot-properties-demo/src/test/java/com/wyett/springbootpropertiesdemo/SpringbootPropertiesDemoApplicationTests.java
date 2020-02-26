package com.wyett.springbootpropertiesdemo;

import com.wyett.springbootpropertiesdemo.bean.Person;
import com.wyett.springbootpropertiesdemo.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

//@RunWith("SpringRunner.class")
@SpringBootTest
class SpringbootPropertiesDemoApplicationTests {
    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    void printHelloService() {
        boolean r = ioc.containsBean("helloService");
        System.out.println(r);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
