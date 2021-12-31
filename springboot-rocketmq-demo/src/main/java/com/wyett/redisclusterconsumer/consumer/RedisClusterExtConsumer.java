package com.wyett.redisclusterconsumer.consumer;

import com.wyett.commonsample.domain.CanalMQFlatMsgEntry;
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
@RocketMQMessageListener(topic = "rediscluster-write-all-ddl1", consumerGroup = "rediscluster-consumer-group2")
public class RedisClusterExtConsumer implements RocketMQListener<CanalMQFlatMsgEntry> {

//    private OutputFile outputFile = new OutputFile();

    String sqlText = "";

    @Override
    public void onMessage(CanalMQFlatMsgEntry mySQLBinlog) {
        if (mySQLBinlog.getType().equals("INSERT")
                && mySQLBinlog.getDatabase().equals("rediscluster") && mySQLBinlog.getTable().equals("app_reshard")
                && (mySQLBinlog.getSql().contains("20755")   )
        ) {
            sqlText = mySQLBinlog.getSql().replaceAll("[\\n\\t\\r]","").replaceAll("[ ][ ]*"," ");
            System.out.println("SQL信息: " + sqlText);
            try {
                FileWriter.writeWithFileChannel(sqlText);
            } catch (IOException e) {
                //log.debug(e.getMessage());
                //e.printStackTrace();
            }
        }
        //System.out.println(mySQLBinlog.toString());
    }
}
