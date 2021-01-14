package com.wyett.basic.algorithm;

import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Collection;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/11 18:16
 * @description: TODO
 */

public class MyOnwerDBAlgorithm implements ComplexKeysShardingAlgorithm {
    @Override
    public Collection<String> doSharding(Collection collection, ComplexKeysShardingValue complexKeysShardingValue) {


        return null;
    }

}
