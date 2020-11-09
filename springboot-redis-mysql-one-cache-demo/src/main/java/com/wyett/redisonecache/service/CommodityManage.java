package com.wyett.redisonecache.service;

import com.wyett.redisonecache.model.Commodity;

import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/9 16:47
 * @description: TODO
 */

public interface CommodityManage {


    /**
     * get Commodity by Id
     * @param id
     * @return
     */
    Commodity getCommodityById(long id);

    /**
     * increse count
     * @param id
     * @return
     */
    Integer incrCommodityById(long id, long incr);
}
