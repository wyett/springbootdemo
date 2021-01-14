package com.wyett.redisclusterconsumer.consumer;

import com.wyett.redisclusterconsumer.domain.MySQLBinlog;
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

@Slf4j
@Service
@RocketMQMessageListener(topic = "rediscluster-instance_info-ddl", consumerGroup = "rediscluster-consumer-group")
public class RedisClusterExtConsumer implements RocketMQListener<MySQLBinlog> {

//    private OutputFile outputFile = new OutputFile();

    @Override
    public void onMessage(MySQLBinlog mySQLBinlog) {
        if (mySQLBinlog.getType().equals("INSERT")
                && mySQLBinlog.getDatabase().equals("rediscluster") && mySQLBinlog.getTable().equals("instance_info")
                && (mySQLBinlog.getSql().contains("10.18.9.41") || mySQLBinlog.getSql().contains("10.18.9.79") )) {
            System.out.println("SQL信息: " + mySQLBinlog.getSql());
            try {
                FileWriter.writeWithFileChannel(mySQLBinlog.getSql());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
