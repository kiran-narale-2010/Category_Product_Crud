package com.kiran.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kiran.entity.Product;
import com.kiran.repository.ProductRepository;

import exception.ResourceNotFoundException;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Page<Product> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return productRepository.findById(id)
            .map(existingProduct -> {
                existingProduct.setName(product.getName());
                existingProduct.setCategory(product.getCategory());
                return productRepository.save(existingProduct);
            })
            .orElseThrow(() -> new ResourceNotFoundException("Product not found with id " + id));
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
