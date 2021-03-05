package com.wyett.tvrocketmq.entry;

/**
 * @author : wyettLei
 * @date : Created in 2021/2/4 19:38
 * @description: TODO
 */

public class Person {
    private String name;
    private Integer age;
    private String Country;
    private String telPhone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Country='" + Country + '\'' +
                ", telPhone='" + telPhone + '\'' +
                '}';
    }
}
