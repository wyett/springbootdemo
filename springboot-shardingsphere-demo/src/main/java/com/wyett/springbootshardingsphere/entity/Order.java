package com.wyett.springbootshardingsphere.entity;

import java.io.Serializable;

/**
 * @author : wyettLei
 * @date : Created in 2021/10/12 19:03
 * @description: TODO
 */

public class Order implements Serializable {

    private static final long serialVersionUID = 2919880358106322724L;

    private long orderId;
    private int userId;
    private long address;
    private String status;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getAddress() {
        return address;
    }

    public void setAddress(long address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", address=" + address +
                ", status='" + status + '\'' +
                '}';
    }
}

