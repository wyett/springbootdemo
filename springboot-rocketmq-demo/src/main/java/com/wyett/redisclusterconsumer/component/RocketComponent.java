package com.wyett.redisclusterconsumer.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/2 18:38
 * @description: TODO
 */

@Component
public class RocketComponent {

    @Value("${my.filter.rocketmq.topicName}")
    private String topic;

    @Value("${my.filter.rocketmq.consumerGroup}")
    private String consumerGroup;

    @Value("${my.filter.operateType}")
    private String operateType;

    @Value("${my.filter.database}")
    private String databaseName;

    @Value("${my.filter.table}")
    private String tableName;


}
