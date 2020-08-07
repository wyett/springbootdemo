package com.wyett.snstllistconsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/1 17:44
 * @description: TODO
 */

@Slf4j
@Service
@RocketMQMessageListener(topic = "sns-tllistrc0-sync-withpos-1", consumerGroup = "rediscluster-consumer-group")
public class SnsTllistrcListener implements RocketMQListener<String> {


    @Override
    public void onMessage(String s) {
        System.out.println("收到的消息" + s);
    }
}
