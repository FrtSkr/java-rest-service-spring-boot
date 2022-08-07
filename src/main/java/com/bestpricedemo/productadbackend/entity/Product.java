package com.bestpricedemo.productadbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //Column annotation'ı, o alanı özelleştirilebilir kılar.
    @Column(nullable = false)
    private String name;

    private double price;
    private String description;

    // --Tablolar arası ilişki oluşturma
    //Birden fazla ürün bir kategoriyle eşleşmesi için 
    @ManyToOne()
    //iki tablo arasında ilişki kurduk ve Product tablosunda category_id adında bir alan oluşturduk.
    //Bu alan değer olarak category tablosundan id alanını tutacak.
    @JoinColumn(name = "category_id")
    private Category category;

    public Product() {
    }

    public Product(long id, String name, double price, String description, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    

    

    
}
