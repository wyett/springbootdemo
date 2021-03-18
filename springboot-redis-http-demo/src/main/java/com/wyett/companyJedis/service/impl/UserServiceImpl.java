package com.wyett.companyJedis.service.impl;

import com.wyett.companyJedis.entry.User;
import com.wyett.companyJedis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/18 15:09
 * @description: TODO
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public User getValueByKey(String key) {
        return redisTemplate.hasKey(key) ? (User)redisTemplate.opsForValue().get(key) : null;
    }

    @Override
    public void save(String key, User v) {
        redisTemplate.opsForValue().setIfAbsent(key, v);
    }
}
