package com.rqtech.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rqtech.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
