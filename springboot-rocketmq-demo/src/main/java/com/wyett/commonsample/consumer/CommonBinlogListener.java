package com.wyett.commonsample.consumer;

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

//@Slf4j
//@Service
//@RocketMQMessageListener(topic = "ugc-videodb69-sql-dump-2", consumerGroup = "videodb69-consumer-group")
public class CommonBinlogListener implements RocketMQListener<String> {

    private OutputFile outputFile = new OutputFile();

    @Override
    public void onMessage(String s) {
        if (s.indexOf("UPDATE") != -1) {
            System.out.println("收到的消息" + s);
            try {
                FileWriter.writeWithFileChannel(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
