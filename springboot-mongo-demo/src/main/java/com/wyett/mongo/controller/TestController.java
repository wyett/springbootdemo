package com.wyett.mongo.controller;

import com.mongodb.client.ListCollectionsIterable;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2020/4/3 16:10
 * @description: TODO
 */

@RestController
public class TestController {

    @Autowired
    private MongoDbFactory mongoDbFactory;

    // http://localhost:8080/demo/queryByDbname?dbname=wyett
    @RequestMapping("/queryByDbname")
    public void listCollection(@RequestParam(value = "dbname") String dbname) {
        MongoCursor<Document> mongoCursor = mongoDbFactory.getDb(dbname).listCollections().cursor();
        while (mongoCursor.hasNext()) {
            //System.out.println(mongoCursor.next().get("name"));
            System.out.println(mongoCursor.next());
        }
    }
}
