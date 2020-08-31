package com.wyett.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/28 11:32
 * @description: TODO
 */

@Component
public class MongoShakeKafkaConsumerDemo1 {


    //@KafkaListener(topics = "mongoshake_test1_topic", groupId = "mygroup1")
    @KafkaListener(topics = "sns_hycs_data_op_mysql_sync_test", groupId = "mygroup1")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println(record.topic() + " - " + record.key() + ":" + record.value());

    }
}
