package com.wyett.mongo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author : wyettLei
 * @date : Created in 2020/12/21 11:46
 * @description: TODO
 */

@Configuration
public class MongoConfig {

    @Autowired
    private MongoDbFactory mongoDbFactory;

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoDbFactory);
    }
}
