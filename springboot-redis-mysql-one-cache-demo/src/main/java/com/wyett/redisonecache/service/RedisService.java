package com.wyett.redisonecache.service;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/5 16:29
 * @description: TODO
 */

public interface RedisService {

    /**
     * set
     * @param key
     * @param value
     */
    void set(String key, String value);


    /**
     * get
     * @param key
     * @return
     */
    String get(String key);


    /**
     * set expire time of key
     * @param key
     * @param expireTime
     */
    boolean expire(String key, long expireTime);


    /**
     * remove key
     * @param key
     * @return
     */
    void remove(String key);

    /**
     * increate by inc
     * @param key
     * @param inc
     */
    void increment(String key, long inc);


}
