package com.rqtech.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rqtech.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
