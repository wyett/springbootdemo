package com.wyett.redisonecache.config;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/15 17:41
 * @description: TODO
 */

@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 120)
public class RedisHttpSessionConfiguration {
    // 分布式会话中，session存在redis中
}
