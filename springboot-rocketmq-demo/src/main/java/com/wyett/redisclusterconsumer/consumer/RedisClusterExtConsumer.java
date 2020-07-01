package com.wyett.redisclusterconsumer.consumer;

import com.alibaba.fastjson.JSON;
import com.wyett.redisclusterconsumer.domain.MySQLBinlog;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.spring.core.RocketMQListener;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/1 19:05
 * @description: TODO
 */

public class RedisClusterExtConsumer implements RocketMQListener<MySQLBinlog> {
    @Override
    public void onMessage(MySQLBinlog mySQLBinlog) {
        Message message = new Message();

    }
}
