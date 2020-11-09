package com.wyett.redisonecache.service;

import com.wyett.redisonecache.exception.BusinessException;
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
    long getRemainCountById(long id) throws Exception;

    /**
     * increse count
     * @param id
     * @return
     */
    void incrCommodityById(long id, int incr) throws BusinessException;
}
