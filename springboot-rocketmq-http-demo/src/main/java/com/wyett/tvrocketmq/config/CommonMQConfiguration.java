package com.wyett.tvrocketmq.config;

import com.sohu.tv.mq.rocketmq.Producer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : wyettLei
 * @date : Created in 2021/2/5 18:52
 * @description: TODO
 */

@Configuration
public class CommonMQConfiguration {
    @Value("${flushCache.producerGroup}")
    private String flushCacheProducer;

    @Value("${flushCache.topic}")
    private String flushCacheTopic;

    @Bean(initMethod = "start", destroyMethod = "shutdown")
    public Producer flushCacheProducer() {
        return new Producer(flushCacheProducer, flushCacheTopic);
    }
}

