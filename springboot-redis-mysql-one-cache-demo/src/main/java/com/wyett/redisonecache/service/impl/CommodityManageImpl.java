package com.wyett.redisonecache.service.impl;

import com.wyett.redisonecache.exception.BusinessException;
import com.wyett.redisonecache.mapper.CommodityMapper;
import com.wyett.redisonecache.model.Commodity;
import com.wyett.redisonecache.service.CommodityManage;
import com.wyett.redisonecache.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author : wyettLei
 * @date : Created in 2020/11/9 17:31
 * @description: TODO
 */

@Service
public class CommodityManageImpl implements CommodityManage {

    @Autowired
    private RedisService redisService;

    @Autowired
    private CommodityMapper commodityMapper;

    /**
     * 查询mysql并且更新redis缓存
     * @param id
     * @return
     */
    @Override
    public long getRemainCountById(long id) throws BusinessException {
        // 1.如果redis中有key，则返回value
        String keyId = String.valueOf(id);
        if (redisService.hasKey(keyId)) {
            return Long.valueOf(redisService.get(keyId));
        }
        // 2.如果不存在key,则查mysql并且更新redis，暂不考虑一致性
        Commodity commodity = commodityMapper.selectByPrimaryKey(id);
        if (commodity == null) {
            throw new BusinessException("没有商品" + id);
        }
        redisService.set(keyId, String.valueOf(commodity.getRemainCount()));
        return commodity.getRemainCount();
    }


    /**
     * increace count by id
     * @param id
     * @return
     */
    @Override
    public void incrCommodityById(long id, int incr) throws BusinessException {
        // 1.从缓存获取当前count
        String keyId = String.valueOf(id);
        if (redisService.hasKey(keyId) && redisService.get(keyId) != null) {
            redisService.increment(keyId, incr);
        }

        // 2.如果不存在，则从库中获取当前值;
        Commodity commodity = commodityMapper.selectByPrimaryKey(id);
        if (commodity == null) {
            throw new BusinessException("没有商品" + id);
        }

        // 3.更新库和缓存
        Integer remainCount = commodity.getRemainCount() + incr;
        commodity.setRemainCount(remainCount);
        commodityMapper.updateByPrimaryKey(commodity);
        redisService.set(keyId, String.valueOf(remainCount));

    }

}
