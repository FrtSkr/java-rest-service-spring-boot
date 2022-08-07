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
    public Product save(Product product) {
        
        return productRepository.save(product);
    }

    @Override
    public Product findByName(String name) {
       
        return productRepository.findByName(name);
    }
    
    
}
