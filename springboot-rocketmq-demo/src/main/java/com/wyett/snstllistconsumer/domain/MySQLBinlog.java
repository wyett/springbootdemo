package com.wyett.snstllistconsumer.domain;

import java.io.Serializable;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/1 19:01
 * @example : {
 *     "data":null,
 *     "database":"",
 *     "es":1592288910000,
 *     "id":2820,
 *     "isDdl":false,
 *     "mysqlType":null,
 *     "old":null,
 *     "pkNames":null,
 *     "sql":"SET INSERT_ID = 62473581",
 *     "sqlType":null,
 *     "table":"",
 *     "ts":1593592401335,
 *     "type":"QUERY"
 * }
 * @description: TODO
 */

public class MySQLBinlog implements Serializable {

    private static final long serialVersionUID = 2558393821455834686L;

    private String data;
    private String database;
    private Long es;
    private Integer id;
    private boolean isDdl;
    private String mysqlType;
    private String old;
    private String pkName;
    private String sql;
    private String table;
    private Long ts;
    private String type;


    @Override
    public String toString() {
        return "MySQLBinlog{" +
                "data='" + data + '\'' +
                ", database='" + database + '\'' +
                ", es=" + es +
                ", id=" + id +
                ", isDdl=" + isDdl +
                ", mysqlType='" + mysqlType + '\'' +
                ", old='" + old + '\'' +
                ", pkName='" + pkName + '\'' +
                ", sql='" + sql + '\'' +
                ", table='" + table + '\'' +
                ", ts=" + ts +
                ", type='" + type + '\'' +
                '}';
    }

    public String getData() {
        return data;
    }

    public String getDatabase() {
        return database;
    }

    public Long getEs() {
        return es;
    }

    public Integer getId() {
        return id;
    }

    public boolean isDdl() {
        return isDdl;
    }

    public String getMysqlType() {
        return mysqlType;
    }

    public String getOld() {
        return old;
    }

    public String getPkName() {
        return pkName;
    }

    public String getSql() {
        return sql;
    }

    public String getTable() {
        return table;
    }

    public Long getTs() {
        return ts;
    }

    public String getType() {
        return type;
    }
}
