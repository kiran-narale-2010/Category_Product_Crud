package com.kiran.service;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kiran.entity.Category;

public interface CategoryService {
	Page<Category> getAllCategories(Pageable pageable);
    Category createCategory(Category category);
    Optional<Category> getCategoryById(Long id);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);

}
