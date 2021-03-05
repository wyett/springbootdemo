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
@RocketMQMessageListener(topic = "ugc-videodb69-sql-dump-1", consumerGroup = "videodb69-consumer-group")
public class RedisClusterExtConsumer implements RocketMQListener<MySQLBinlog> {

//    private OutputFile outputFile = new OutputFile();

    @Override
    public void onMessage(MySQLBinlog mySQLBinlog) {
        System.out.println(mySQLBinlog.toString());
        //if (mySQLBinlog.getType().equals("UPDATE")
        //        && mySQLBinlog.getDatabase().equals("rediscluster") && mySQLBinlog.getTable().equals("instance_info")
        //        && (mySQLBinlog.getSql().contains("10.18.9.41") || mySQLBinlog.getSql().contains("10.18.9.79") )) {
        //    System.out.println("SQL信息: " + mySQLBinlog.getSql());
        //    try {
        //        BinlogWriter.writeWithFileChannel(mySQLBinlog.getSql());
        //    } catch (IOException e) {
        //        e.printStackTrace();
        //    }
        //}
    }
}
