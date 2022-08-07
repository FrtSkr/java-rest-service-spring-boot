package com.bestpricedemo.productadbackend.service;

import org.springframework.stereotype.Service;

import com.bestpricedemo.productadbackend.entity.Product;
import com.bestpricedemo.productadbackend.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product sava(Product product) {
        
        return productRepository.save(product);
    }
    
}
