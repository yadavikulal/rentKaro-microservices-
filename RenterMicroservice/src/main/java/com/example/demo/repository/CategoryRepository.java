package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	List<Category> findByCategory(String category);
	List<Category> findByProductlist(String category);
}
