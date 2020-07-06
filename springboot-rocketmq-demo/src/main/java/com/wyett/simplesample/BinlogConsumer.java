package com.wyett.simplesample;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/6 15:49
 * @description: TODO
 */

@Service
public class BinlogConsumer {
    private static final String CONSUMER_GROUP = "rediscluster-consumer-group";
    private static final String TOPIC = "rediscluster-instance_info-ddl";
    public static final String NAME_SRV = "127.0.0.1:9876";

    public static void main(String[] args) throws MQClientException {
        // 1.设置consume group
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(CONSUMER_GROUP);

        // 2.设置nameserver地址
        consumer.setNamesrvAddr(NAME_SRV);

        // 3.设置起始位置
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);

        // 4.订阅
        consumer.subscribe(TOPIC, "*");

        // 5.注册消息监听
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {

                try {
                    MessageExt messageExt = msgs.get(0);
                    String topic = messageExt.getTopic();
                    String message = null;
                    message = new String(messageExt.getBody(),"UTF-8");
                    int queueId = messageExt.getQueueId();

                    System.out.println("收到来自topic:" + topic + ", queueId:" + queueId + "的消息：" + message);

                } catch (UnsupportedEncodingException e) {
                    return ConsumeConcurrentlyStatus.RECONSUME_LATER;
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        consumer.start();

    }
}
