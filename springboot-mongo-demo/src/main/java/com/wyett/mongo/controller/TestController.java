package com.wyett.mongo.controller;

import com.mongodb.client.ListCollectionsIterable;
import com.mongodb.client.MongoCursor;
import com.wyett.mongo.models.CatDao;
import com.wyett.mongo.services.MongoSimpleOps;
import com.wyett.mongo.services.impl.MongoSimpleOpsImpl;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2020/4/3 16:10
 * @description: TODO
 */

@Slf4j
@RestController
//@RequestMapping("/cat")
public class TestController {

    @Autowired
    private MongoDbFactory mongoDbFactory;

    @Autowired
    private MongoSimpleOps mongoSimpleOps;

    @RequestMapping(value = "/queryByDbname")
    public void listCollection(@RequestParam(value = "dbname") String dbname) {
        MongoCursor<Document> mongoCursor = mongoDbFactory.getDb(dbname).listCollections().cursor();
        while (mongoCursor.hasNext()) {
            System.out.println(mongoCursor.next());
            log.info("");
        }
    }

    @RequestMapping(value = "/writeCat")
    public boolean writeCat(@RequestParam(value = "dbname") String dbname, Integer count) {
        CatDao catDao = new CatDao();
        catDao.setName("cat");
        catDao.setAge(10);
        catDao.setColor("yellow");
        catDao.setLength(20);
        catDao.setWeight(10);

        while(count-- > 0) {
            log.info(MessageFormat.format("count:{0}, json:{1}",count, catDao));
            catDao.setCatId(String.valueOf(1000000000 + count));
            catDao.setSayHi("Hello, I am No." + catDao.getCatId() + " cat");
            mongoSimpleOps.insertSingle(catDao);
        }
        return true;
    }

}
