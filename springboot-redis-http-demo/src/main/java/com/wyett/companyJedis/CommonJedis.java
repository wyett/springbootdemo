package com.wyett.companyJedis;

import com.sohu.jedis.ApiInfo;
import com.sohu.jedis.CustomJedis;
import com.sohu.jedis.CustomJedisPool;
import com.sohu.jedis.Role;
import com.wyett.companyJedis.config.JedisConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author : wyettLei
 * @date : Created in 2021/2/8 17:45
 * @description: TODO
 */

@SpringBootApplication
public class CommonJedis {

    public static void main(String[] args) {
        SpringApplication.run(CommonJedis.class, args);

        /**
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setNumTestsPerEvictionRun(-1);// 这个配置项可以不用显式指定，jedispoolConfig默认给的是-1，这里写出来只是为了解释下-1的含义：对连接池中的所有空闲连接进行检查
        poolConfig.setTimeBetweenEvictionRunsMillis(300000); // 5分钟
        poolConfig.setMinEvictableIdleTimeMillis(600000);// 10分钟
        final ApiInfo apiInfo = ApiInfo.build().setUrl(jedisConfiguration.)
                .setRole(Role.MASTER).create();
        CustomJedisPool pool = new CustomJedisPool(poolConfig, apiInfo, "8802f4c5c3b84944903ca143afa12967");
        CustomJedis jedis = null;
        try {
            jedis = pool.getResource();
            jedis.psetex("easonhan", 30, "random");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if (jedis != null) {
                jedis.close();
            }
        }
        //对于一般的业务场景，可在所有redis任务结束后再关闭连接池，此处仅为示例
        pool.close();
         */
    }
}
