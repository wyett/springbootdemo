package com.wyett.mysql.controller;

import com.wyett.mysql.entry.Order;
import com.wyett.mysql.registory.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/15 12:08
 * @description: TODO
 */

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping("/getAllOrder")
    public List<Order> getOrderById(@Param("id") String id) {
        List<Order> orders = orderRepository.getOrderByOrderId(id);
        return orders;
    }

    @RequestMapping("/createNewOrder")
    public void createNewOrder(@Param("orderId") String orderId, @Param("productId") String productId,
                               @Param("cost") String cost, @Param("sendAddr") String sendAddr) {
        orderRepository.saveOrder(orderId, productId, cost, sendAddr);
    }

}
