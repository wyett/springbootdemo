package com.wyett.snstllistconsumer.consumer;

import com.wyett.snstllistconsumer.domain.MySQLBinlog;
import com.wyett.io.FileWriter;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/1 19:05
 * @description: TODO
 */

//@Slf4j
//@Service
//@RocketMQMessageListener(topic = "my-sync-withpos-1", consumerGroup = "my-consumer-group")
public class SnsTllistrcConsumer implements RocketMQListener<MySQLBinlog> {

//    private OutputFile outputFile = new OutputFile();

    @Override
    public void onMessage(MySQLBinlog mySQLBinlog) {
        /*
        if (mySQLBinlog.getType().equals("INSERT") {
            System.out.println("SQL信息: " + mySQLBinlog.getSql());
            try {
                FileWriter.writeWithFileChannel(mySQLBinlog.getSql());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

         */
        System.out.println(mySQLBinlog);
    }
}
