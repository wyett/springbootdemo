package com.wyett.consumer.components;

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
public class CanalCommonComponent {


    //@KafkaListener(topics = "mongoshake_test1_topic", groupId = "mygroup1")
    //@KafkaListener(topics = "only-wyett3-prod", groupId = "mygroup1")
    @KafkaListener(topics = "sns_hycs_mario_mysql_canal_dev", groupId = "mygroup1")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println(record.topic() + " - " + record.key() + ":" + record.value());

    }
}
