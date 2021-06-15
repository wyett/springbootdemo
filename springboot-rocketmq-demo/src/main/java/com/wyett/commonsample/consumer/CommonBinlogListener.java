package com.wyett.commonsample.consumer;

import com.wyett.commonsample.domain.CanalMQFlatMsgEntry;
import com.wyett.io.FileWriter;
import com.wyett.io.OutputFile;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/1 17:44
 * @description: TODO
 */

@Slf4j
@Service
//@RocketMQMessageListener(topic = "dba-canal-mq-connector-test-dba-test-topic", consumerGroup = "dba-canal-mq" +
//        "-connector-test-consumer")
//@RocketMQMessageListener(topic = "vip-film-order-binlog-test-topic", consumerGroup = "dba-test-filmorder-comsumer1")
@RocketMQMessageListener(topic = "sns_m4m_data_op_mysql_sync_test1", consumerGroup = "dba-test-m4m-comsumer1")
public class CommonBinlogListener implements RocketMQListener<CanalMQFlatMsgEntry> {

    //private OutputFile outputFile = new OutputFile();
    String sqlText = "";

    @Override
    public void onMessage(CanalMQFlatMsgEntry canalMQFlatMsgEntry) {

        sqlText = canalMQFlatMsgEntry.getSql().replaceAll("[\\n\\t\\r]","").replaceAll("[ ][ ]*"," ");
        //sqlText = canalMQFlatMsgEntry.getSql();
        System.out.println("SQL信息: " + sqlText);
        try {
            //FileWriter.writeWithFileChannel(canalMQFlatMsgEntry.getSql().replaceAll("[\\n\\t\\r]",""));
            FileWriter.writeWithFileChannel(sqlText);
        } catch (IOException e) {
            //log.debug(e.getMessage());
            //e.printStackTrace();
        }
        //System.out.println(s);
        //if (s.indexOf("UPDATE") != -1) {
        //    System.out.println("收到的消息" + s);
        //    try {
        //        FileWriter.writeWithFileChannel(s);
        //    } catch (IOException e) {
        //        e.printStackTrace();
        //    }
        //}
    }

}
