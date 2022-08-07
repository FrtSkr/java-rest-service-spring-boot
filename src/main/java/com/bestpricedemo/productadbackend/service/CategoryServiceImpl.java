package com.bestpricedemo.productadbackend.service;

import org.springframework.stereotype.Service;

import com.bestpricedemo.productadbackend.entity.Category;
import com.bestpricedemo.productadbackend.repository.CategoryRepository;


@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }
    
}
