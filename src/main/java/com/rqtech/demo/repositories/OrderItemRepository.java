package com.rqtech.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rqtech.demo.entities.OrderItem;
import com.rqtech.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
