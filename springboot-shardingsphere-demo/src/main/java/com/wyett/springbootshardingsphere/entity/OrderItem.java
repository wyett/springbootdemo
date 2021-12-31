package com.wyett.springbootshardingsphere.entity;

import java.io.Serializable;

/**
 * @author : wyettLei
 * @date : Created in 2021/10/12 19:37
 * @description: TODO
 */


public class OrderItem implements Serializable {
    private static final long serialVersionUID = 5465828728547624579L;

    private long orderItemId;
    private long orderId;
    private int userId;
    private String status;

    public long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(long orderItemId) {
        this.orderItemId = orderItemId;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId=" + orderItemId +
                ", orderId=" + orderId +
                ", userId=" + userId +
                ", status='" + status + '\'' +
                '}';
    }
}
