package com.kiran.service;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kiran.entity.Product;

public interface ProductService {
    Page<Product> getAllProducts(Pageable pageable);
    Product createProduct(Product product);
    Optional<Product> getProductById(Long id);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);

}
