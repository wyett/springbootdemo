package com.wyett.commonsample.consumer;

import com.wyett.commonsample.domain.CanalMQFlatMsgEntry;
import com.wyett.io.FileWriter;
import com.wyett.io.OutputFile;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


/**
 * @author : wyettLei
 * @date : Created in 2020/7/1 19:05
 * @description: TODO
 */

@Slf4j
@Service
@RocketMQMessageListener(topic = "ugc-videodb69-sql-dump-2", consumerGroup = "videodb69-consumer-group-2")
public class CommonBinlogConsumer implements RocketMQListener<CanalMQFlatMsgEntry> {


    //private static OutputFile outputFile = new OutputFile();

    private static Long startTime = Long.valueOf(1614870000 * 1000);
    private static Long endTime = Long.valueOf(1614870900 * 1000);
    //private static List<String> matchList = new ArrayList<>(Arrays.asList("status=32", "status=40", "status=30","status=33"));

    private static List<String> matchList = Arrays.asList("status=32", "status=40", "status=30", "status=33");

    @Override
    public void onMessage(CanalMQFlatMsgEntry canalMQFlatMsgEntry) {
        log.info(canalMQFlatMsgEntry.toString());
        //System.out.println(canalMQFlatMsgEntry.toString());
        if (canalMQFlatMsgEntry.getType().equals("UPDATE") && canalMQFlatMsgEntry.getTable().equals("videoinfo")
                && canalMQFlatMsgEntry.getEs() >= startTime && canalMQFlatMsgEntry.getEs() <= endTime
                && containAny(Arrays.asList(canalMQFlatMsgEntry.getSql().replace(",", "").split(" ")),
                matchList)
        ) {
            //System.out.println(canalMQFlatMsgEntry.toString());
            System.out.println("SQL信息: " + canalMQFlatMsgEntry.getSql());
            try {
                FileWriter.writeWithFileChannel(canalMQFlatMsgEntry.getSql());
            } catch (IOException e) {
                log.debug(e.getMessage());
                //e.printStackTrace();
            }
        }

    }

    public Boolean containAny(List<String> flist, List<String> llist) {
        for (String ls : llist) {
            if (flist.contains(ls)) {
                return true;
            }
        }
        return false;
    }
}
