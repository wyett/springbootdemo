package com.wyett.redisonecache.controller;

import com.wyett.redisonecache.service.CommodityManage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/9 19:32
 * @description: TODO
 */

@Slf4j
@RestController
public class CommodityManageController {

    @Autowired
    private CommodityManage commodityManage;

}
