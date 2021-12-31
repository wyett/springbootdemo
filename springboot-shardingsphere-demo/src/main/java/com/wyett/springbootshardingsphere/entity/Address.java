package com.wyett.springbootshardingsphere.entity;

import java.io.Serializable;

/**
 * @author : wyettLei
 * @date : Created in 2021/10/12 19:39
 * @description: TODO
 */

public class Address implements Serializable {
    private static final long serialVersionUID = -991243035023332942L;

    private long addressId;
    private String addressName;

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", addressName='" + addressName + '\'' +
                '}';
    }
}
