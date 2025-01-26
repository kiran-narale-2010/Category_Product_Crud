package com.kiran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiran.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
} 