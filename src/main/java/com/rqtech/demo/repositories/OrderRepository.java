package com.rqtech.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rqtech.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
