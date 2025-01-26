package com.kiran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiran.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
