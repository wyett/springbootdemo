package com.wyett.mongo.utils;


import org.apache.commons.lang3.StringUtils;

/**
 * @author : wyettLei
 * @date : Created in 2020/12/21 16:25
 * @description: TODO
 */

public class CatUtils {
    public static final String CAT_COLL_PREFIX = "cat_";

    public static String getCollNameByCatId(String catId) {
        if(StringUtils.isEmpty(catId)) {
            return null;
        }
        return CAT_COLL_PREFIX + IDUtils.parseDate(Long.parseLong(catId),"yyyyMM");
    }
}
