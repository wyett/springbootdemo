package com.wyett.commonsample.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.Arrays;
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

public class CanalMQFlatMsgEntry implements Serializable {

    private static final long serialVersionUID = 2558393821455834686L;

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

    public List<Map<String, String>> getData() {
        return data;
    }

    public String getDatabase() {
        return database;
    }

    public Long getEs() {
        return es;
    }

    public Long getId() {
        return id;
    }

    public Boolean getDdl() {
        return isDdl;
    }

    public Map<String, String> getMysqlType() {
        return mysqlType;
    }

    public List<Map<String, String>> getOld() {
        return old;
    }

    public List<String> getPkNames() {
        return pkNames;
    }

    public String getSql() {
        return sql;
    }

    public Map<String, Integer> getSqlType() {
        return sqlType;
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
