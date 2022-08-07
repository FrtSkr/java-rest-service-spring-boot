package com.bestpricedemo.productadbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bestpricedemo.productadbackend.entity.Category;
import com.bestpricedemo.productadbackend.service.CategoryService;

@RestController
//İstek category ise istekler buraya düşsün
@RequestMapping("/category")
public class CategoryController {
    
     private final CategoryService categoryService;

     

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @PostMapping
    public ResponseEntity save(@RequestBody Category category){
        return ResponseEntity.ok(categoryService.save(category));        
    }

}
