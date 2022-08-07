package com.bestpricedemo.productadbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    //RequestBody annotation'ı gelen verinin serialize işlemlerini gerçekleştiriyor
    public ResponseEntity save(@RequestBody Product product){
        return ResponseEntity.ok(productService.save(product));
    }

    //URL den bir name alacağız ve bu name kullanıcının yolladığı name olacak.
    @GetMapping("/name/{name}")
    public ResponseEntity findByName(@PathVariable("name") String name){
        return ResponseEntity.ok(productService.findByName(name));
    }
}
