package com.wyett.mongo.services;

/**
 * @author : wyettLei
 * @date : Created in 2020/12/21 11:40
 * @description: TODO
 */

public interface MongoSimpleOps<T> {


    /**
     * create document
     * @param collname
     */
    void createCatCollection(String collname);

    /**
     * insert one doc per ops
     * @param dao
     */
    void insertSingle(T dao);


    /**
     *
     * @param dbname
     * @param collection
     * @param json
     */
    void blukInsertMany(String dbname, String collection, String json);

}
