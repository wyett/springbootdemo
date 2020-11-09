package com.wyett.redisonecache.service.impl;

import com.wyett.redisonecache.config.MybatisConfig;
import com.wyett.redisonecache.mapper.CommodityMapper;
import com.wyett.redisonecache.model.Commodity;
import com.wyett.redisonecache.service.CommodityManage;
import com.wyett.redisonecache.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Commodity getCommodityById(long id) {
        Commodity commodity = commodityMapper.selectByPrimaryKey(id);
        if (commodity == null) {
            return null;
        }
        redisService.set(String.valueOf(id), String.valueOf(commodity.getRemainCount()));
        return commodity;
    }

    /**
     * increace count by id
     * @param id
     * @return
     */
    @Override
    public Integer incrCommodityById(long id, long incr) {
        // 1.从缓存获取当前count
        if (redisService.hasKey(String.valueOf(id)))

        // 2.如果不存在，则从库中获取当前值; 增加

        // 3.将库中当前值存入缓存
        return null;
    }


}
