package com.wyett.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/3 17:51
 * @description: session prefix and expire
 */


@ConfigurationProperties(prefix = "redis.key")
public class RedisKeyPrefixConfig {
    private String prefix;
    private Long expire;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Long getExpire() {
        return expire;
    }

    public void setExpire(Long expire) {
        this.expire = expire;
    }

    /**
    private RedisKeyPrefixConfig.Prefix prefix;

    private RedisKeyPrefixConfig.Expire expire;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public void setExpire(Expire expire) {
        this.expire = expire;
    }

    public Expire getExpire() {
        return expire;
    }

    @Data
    public static class Prefix{
        private String token;

        public String getToken() {
            return token;
        }
    }
     */

    @Data
    public static class Expire{

        private Long token;

        public Long getToken() {
            return token;
        }
    }



}
