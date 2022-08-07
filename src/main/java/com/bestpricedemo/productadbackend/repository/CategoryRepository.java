package com.bestpricedemo.productadbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bestpricedemo.productadbackend.entity.Category;

//Veritabanıyla etkileşime geçecek olan sınıfımızı belirttik.
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
