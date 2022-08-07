package com.bestpricedemo.productadbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bestpricedemo.productadbackend.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
