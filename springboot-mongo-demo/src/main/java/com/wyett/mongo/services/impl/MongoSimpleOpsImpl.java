package com.wyett.mongo.services.impl;

import com.mongodb.DuplicateKeyException;
import com.wyett.mongo.models.CatDao;
import com.wyett.mongo.services.MongoSimpleOps;
import com.wyett.mongo.utils.CatUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.Index;
import org.springframework.data.mongodb.core.index.IndexOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Queue;

/**
 * @author : wyettLei
 * @date : Created in 2020/12/21 11:44
 * @description: TODO
 */

@Service
public class MongoSimpleOpsImpl implements MongoSimpleOps<CatDao> {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * create Cat collection and ensure Index
     * @param collname
     */
    @Override
    public void createCatCollection(String collname) {
        if(!mongoTemplate.collectionExists(collname)){
            mongoTemplate.createCollection(collname);
            IndexOperations indexOperations = mongoTemplate.indexOps(collname);
            indexOperations.ensureIndex(new Index("catId", Sort.Direction.ASC).unique());
            indexOperations.ensureIndex(new Index("name", Sort.Direction.ASC).unique());
        }
    }


    @Override
    public void insertSingle(CatDao cat) {
        // get collection name by id
        String collName = CatUtils.getCollNameByCatId(cat.getCatId());
        if(StringUtils.isEmpty(collName)) {
            return;
        }
        try {
            mongoTemplate.insert(cat, collName);
        } catch (DuplicateKeyException e) {
            Query query = new Query(Criteria.where("catId").is(cat.getCatId()));
            mongoTemplate.upsert(query, buildDocUpdate(cat), collName);
        }
    }

    private Update buildDocUpdate(CatDao cat) {
        Update update = new Update();
        try {
            Map<String, Object> describe = PropertyUtils.describe(cat);
            describe.remove("class");
            describe.forEach((k, v) -> {
                if (v != null) {
                    update.set(k, v);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        return update;
    }

    @Override
    public void blukInsertMany(String dbname, String collection, String json) {

    }
}
