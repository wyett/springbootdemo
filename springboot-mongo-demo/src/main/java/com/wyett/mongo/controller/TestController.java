package com.wyett.mongo.controller;

import com.mongodb.client.ListCollectionsIterable;
import com.mongodb.client.MongoCursor;
import com.wyett.mongo.models.CatDao;
import com.wyett.mongo.services.MongoSimpleOps;
import com.wyett.mongo.services.impl.MongoSimpleOpsImpl;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.web.bind.annotation.PostMapping;
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

    @Autowired
    private MongoSimpleOps mongoSimpleOps;

    // http://localhost:8080/demo/queryByDbname?dbname=wyett
    @RequestMapping("/queryByDbname")
    public void listCollection(@RequestParam(value = "dbname") String dbname) {
        MongoCursor<Document> mongoCursor = mongoDbFactory.getDb(dbname).listCollections().cursor();
        while (mongoCursor.hasNext()) {
            //System.out.println(mongoCursor.next().get("name"));
            System.out.println(mongoCursor.next());
        }
    }

    //@PostMapping("/writeIntoDatabase")
    //public void writeDate(@RequestParam(value = "dbname") String dbname,
    //                      @RequestParam(value = "collname") String collname) {
    //
    //}
    @PostMapping("/writeCat")
    public void writeCat(@RequestParam(value = "dbname") String dbname, Integer count) {
        CatDao catDao = new CatDao();
        catDao.setName("cat");
        catDao.setAge(10);
        catDao.setColor("yellow");
        catDao.setLength(20);
        catDao.setWeight(10);
        //catDao.setSayHi("Hello, I am " + catDao + );

        while(count > 0) {

            catDao.setCatId(String.valueOf(1000000000 + count));
            catDao.setSayHi("Hello, I am No." + catDao.getCatId() + " cat");
            mongoSimpleOps.insertSingle(catDao);
        }
    }
}
