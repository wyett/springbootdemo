package com.wyett.redisclusterconsumer.domain;

import java.io.Serializable;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/1 19:01
 * @description: TODO
 */

public class MySQLBinlog implements Serializable {

    private String databaseName;

    private String sqlText;

    private String tableName;

    private Integer time;

    private String sqlType;

    public MySQLBinlog(String databaseName, String sqlText, String tableName, Integer time, String sqlType) {
        this.databaseName = databaseName;
        this.sqlText = sqlText;
        this.tableName = tableName;
        this.time = time;
        this.sqlType = sqlType;
    }

    @Override
    public String toString() {
        return "MySQLBinlog{" +
                "databaseName='" + databaseName + '\'' +
                ", sqlText='" + sqlText + '\'' +
                ", tableName='" + tableName + '\'' +
                ", time=" + time +
                ", sqlType='" + sqlType + '\'' +
                '}';
    }
}
