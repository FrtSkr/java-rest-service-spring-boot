package com.bestpricedemo.productadbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bestpricedemo.productadbackend.entity.Product;
import com.bestpricedemo.productadbackend.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    

    public ProductController(ProductService productService) {
        this.productService = productService;
    }



    @PostMapping
    public ResponseEntity save(@RequestBody Product product){
        return ResponseEntity.ok(productService.sava(product));
    }
}
