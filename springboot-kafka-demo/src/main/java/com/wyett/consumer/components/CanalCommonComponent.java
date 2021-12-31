package com.wyett.consumer.components;

import com.alibaba.fastjson.JSON;
import com.wyett.consumer.domain.CanalMQFlatMsgEntry;
import com.wyett.consumer.io.FileWriter;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/28 11:32
 * @description: TODO
 */

@Component
public class CanalCommonComponent {


    //@KafkaListener(topics = "mongoshake_test1_topic", groupId = "mygroup1")
    //@KafkaListener(topics = "only-wyett3-prod", groupId = "mygroup1")
    //@KafkaListener(topics = "sns_hycs_mario_mysql_canal_dev", groupId = "mygroup1")
    //@KafkaListener(topics = "sns_feed_test_1", groupId = "mygroup1")
    @KafkaListener(topics = "sns_hycs_data_op_mysql_sync_online", groupId = "wyett-tmp-mygroup6")
    public void listen(String record) {
        CanalMQFlatMsgEntry canalMQFlatMsgEntry = JSON.parseObject(record, CanalMQFlatMsgEntry.class);
        if(canalMQFlatMsgEntry.getDatabase().equals("sns_dbname") && canalMQFlatMsgEntry.getTable().equals(
                "t_name") ) {
            System.out.println(canalMQFlatMsgEntry.getTable() + " " + canalMQFlatMsgEntry.getTs());
        }
    }
}
