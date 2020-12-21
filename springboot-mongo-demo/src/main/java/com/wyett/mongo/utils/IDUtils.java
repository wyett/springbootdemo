package com.wyett.mongo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : wyettLei
 * @date : Created in 2020/12/21 16:41
 * @description: TODO
 */

public class IDUtils {

    public final static long twepoch = 1437644394679L;//起始时间戳,启用之后不可修改
    private final static long serviceIdBits = 5L;
    private final static long workerIdBits = 7L;
    private final static long datacenterIdBits = 3L;
    private final static long sequenceBits = 7L;//自增位

    public final static long timestampLeftShift = sequenceBits + workerIdBits + serviceIdBits + datacenterIdBits;

    public static String format(Date date, String pattern) {
        return date == null ? null : (new SimpleDateFormat(pattern)).format(date);
    }

    public static long parseTime(long id) {
        return (id >> timestampLeftShift) + twepoch;
    }

    public static String parseDate(long id, String format) {
        return format(new Date(parseTime(id)), format);
    }
}
