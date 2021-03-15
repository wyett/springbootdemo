package com.wyett.tvrocketmq.producer;

import com.sohu.index.tv.mq.rocketmq.ProducerRocketMQ;
import com.sohu.tv.mq.rocketmq.Producer;
import org.apache.rocketmq.client.producer.MQProducer;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2021/2/4 19:41
 * @description: TODO
 */

public class CommonProducer {
    Producer mqProducer = new ProducerRocketMQ("dba-canal-mq-connector-test-dba-test-topic-producer",
            "dba-canal-mq-connector-test-dba-test-topic");

}
