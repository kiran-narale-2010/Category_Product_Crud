package com.kiran.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kiran.entity.Category;
import com.kiran.repository.CategoryRepository;

import exception.ResourceNotFoundException;



@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Page<Category> getAllCategories(Pageable pageable) {
    	
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        return categoryRepository.findById(id)
            .map(existingCategory -> {
                existingCategory.setName(category.getName());
                return categoryRepository.save(existingCategory);
            })
            .orElseThrow(() -> new ResourceNotFoundException("Category not found with id " + id));
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

}
