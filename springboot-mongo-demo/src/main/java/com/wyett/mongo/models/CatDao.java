package com.wyett.mongo.models;

import lombok.Data;

/**
 * @author : wyettLei
 * @date : Created in 2020/12/21 15:51
 * @description: TODO
 */

@Data
public class CatDao {

    private String catId;
    private String name;
    private Integer age;
    private String color;
    private Integer length;
    private Integer weight;
    private String sayHi;
}
