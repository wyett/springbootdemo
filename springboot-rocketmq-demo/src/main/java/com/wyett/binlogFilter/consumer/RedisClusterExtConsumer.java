package com.wyett.binlogFilter.consumer;

import com.wyett.binlogFilter.domain.MySQLBinlog;
import com.wyett.binlogFilter.io.BinlogWriter;
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

//@RocketMQMessageListener(topic = "rediscluster-instance_info-ddl", consumerGroup = "rediscluster-consumer-group")
@Slf4j
@Service
@RocketMQMessageListener(topic = "my-sql-dump-1", consumerGroup = "my-consumer-group")
public class RedisClusterExtConsumer implements RocketMQListener<MySQLBinlog> {

//    private OutputFile outputFile = new OutputFile();

    @Override
    public void onMessage(MySQLBinlog mySQLBinlog) {
        System.out.println(mySQLBinlog.toString());
        //if (mySQLBinlog.getType().equals("UPDATE") {
        //    System.out.println("SQL信息: " + mySQLBinlog.getSql());
        //    try {
        //        BinlogWriter.writeWithFileChannel(mySQLBinlog.getSql());
        //    } catch (IOException e) {
        //        e.printStackTrace();
        //    }
        //}
    }
}
