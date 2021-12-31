package com.wyett.consumer.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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
 *
 * sourceCode: com.alibaba.otter.canal.protocol.FlatMessage
 *     private long                      id;
 *     private String                    database;
 *     private String                    table;
 *     private List<String>              pkNames;
 *     private Boolean                   isDdl;
 *     private String                    type;
 *     // binlog executeTime
 *     private Long                      es;
 *     // dml build timeStamp
 *     private Long                      ts;
 *     private String                    sql;
 *     private Map<String, Integer>      sqlType;
 *     private Map<String, String>       mysqlType;
 *     private List<Map<String, String>> data;
 *     private List<Map<String, String>> old;
 *
 *
 * @description: TODO
 */

public class CanalMQFlatMsgEntry {

    //private static final long serialVersionUID = 2558393821455834686L;

    private List<Map<String, String>> data;
    private String database;
    private Long es;
    private Long id;
    private Boolean isDdl;
    private Map<String, String> mysqlType;
    private List<Map<String, String>> old;
    private List<String> pkNames;
    private String sql;
    private Map<String, Integer> sqlType;
    private String table;
    private Long ts;
    private String type;

    public List<Map<String, String>> getData() {
        return data;
    }

    public void setData(List<Map<String, String>> data) {
        this.data = data;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public Long getEs() {
        return es;
    }

    public void setEs(Long es) {
        this.es = es;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDdl() {
        return isDdl;
    }

    public void setDdl(Boolean ddl) {
        isDdl = ddl;
    }

    public Map<String, String> getMysqlType() {
        return mysqlType;
    }

    public void setMysqlType(Map<String, String> mysqlType) {
        this.mysqlType = mysqlType;
    }

    public List<Map<String, String>> getOld() {
        return old;
    }

    public void setOld(List<Map<String, String>> old) {
        this.old = old;
    }

    public List<String> getPkNames() {
        return pkNames;
    }

    public void setPkNames(List<String> pkNames) {
        this.pkNames = pkNames;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Map<String, Integer> getSqlType() {
        return sqlType;
    }

    public void setSqlType(Map<String, Integer> sqlType) {
        this.sqlType = sqlType;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public Long getTs() {
        return ts;
    }

    public void setTs(Long ts) {
        this.ts = ts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CanalMQFlatMsgEntry{" +
                "data=" + data +
                ", database='" + database + '\'' +
                ", es=" + es +
                ", id=" + id +
                ", isDdl=" + isDdl +
                ", mysqlType=" + mysqlType +
                ", old=" + old +
                ", pkNames=" + pkNames +
                ", sql='" + sql + '\'' +
                ", sqlType=" + sqlType +
                ", table='" + table + '\'' +
                ", ts=" + ts +
                ", type='" + type + '\'' +
                '}';
    }
}
