package com.wyett.mysql.registory;

import com.wyett.mysql.entry.Order;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/15 11:19
 * @description: Order和@Query中的Order必须大小一致
 */

public interface OrderRepository extends CrudRepository<Order, Integer> {

    @Query("select o from Order o where o.orderId=?1")
    public List<Order> getOrderByOrderId(@Param("OrderId")String OrderId);

    @Query("select o from Order o where o.orderId=?1 and o.productId=?2")
    public List<Order> getOrderByOrderIdAndProducerId(String orderId, String productId);

    @Transactional
    @Modifying
    @Query(value = "insert into order_info(orderId, productId, cost, sendAddr) values(?1, ?2, ?3, ?4)",
            nativeQuery = true)
    public void saveOrder(String orderId, String producerId, String cost, String sendAddr);
}

