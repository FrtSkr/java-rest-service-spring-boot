package com.bestpricedemo.productadbackend.service;

import com.bestpricedemo.productadbackend.entity.Product;

public interface ProductService {
    Product save(Product product);
    Product findByName(String name);
}
