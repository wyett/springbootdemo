package com.wyett.loginonecache.service;

import java.util.concurrent.TimeUnit;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/10 11:34
 * @description: TODO
 */

public interface RedisService {

    /**
     * check if has key
     * @param key
     * @return
     */
    boolean hasKey(String key);

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
    boolean expire(String key, long expireTime, TimeUnit timeUnit);


    /**
     * remove key
     * @param key
     * @return
     */
    void remove(String key);
}
