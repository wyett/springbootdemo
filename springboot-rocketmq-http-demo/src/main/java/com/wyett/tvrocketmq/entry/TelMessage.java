package com.wyett.tvrocketmq.entry;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : wyettLei
 * @date : Created in 2021/2/4 19:36
 * @description: TODO
 */

public class TelMessage {

    private Integer msgId;
    private Person fromPerson;
    private Person toPerson;
    private String msgContext;
    private Date SendTime;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public Person getFromPerson() {
        return fromPerson;
    }

    public void setFromPerson(Person fromPerson) {
        this.fromPerson = fromPerson;
    }

    public Person getToPerson() {
        return toPerson;
    }

    public void setToPerson(Person toPerson) {
        this.toPerson = toPerson;
    }

    public String getMsgContext() {
        return msgContext;
    }

    public void setMsgContext(String msgContext) {
        this.msgContext = msgContext;
    }

    public Date getSendTime() {
        return SendTime;
    }

    public void setSendTime(Date sendTime) {
        SendTime = sendTime;
    }

    @Override
    public String toString() {
        return "TelMessage{" +
                "msgId=" + msgId +
                ", fromPerson=" + fromPerson +
                ", toPerson=" + toPerson +
                ", msgContext='" + msgContext + '\'' +
                ", SendTime=" + SendTime +
                '}';
    }
}
