package com.wyett.redisonecache.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Commodity implements Serializable {
    private Long id;

    private String commodityName;

    private Byte commodityType;

    private Date onlineTime;

    private Date offlineTime;

    @ApiModelProperty(value = "1: online, 0:offline")
    private Byte status;

    private Float price;

    private Integer remainCount;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Byte getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(Byte commodityType) {
        this.commodityType = commodityType;
    }

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getRemainCount() {
        return remainCount;
    }

    public void setRemainCount(Integer remainCount) {
        this.remainCount = remainCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", commodityName=").append(commodityName);
        sb.append(", commodityType=").append(commodityType);
        sb.append(", onlineTime=").append(onlineTime);
        sb.append(", offlineTime=").append(offlineTime);
        sb.append(", status=").append(status);
        sb.append(", price=").append(price);
        sb.append(", remainCount=").append(remainCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}