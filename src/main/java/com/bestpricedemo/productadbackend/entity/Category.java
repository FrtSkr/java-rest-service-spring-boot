package com.bestpricedemo.productadbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Veritabanında tablomuza karşılık gelen varlık olarak tanımladık.
@Entity
//Tablo olarak kullanacağımızı belirtip veritabanındaki tablo ismini category olarak değiştirdik.
@Table(name = "category")
public class Category {
    //Spring'e id alanını tanıttık. Bu alan üzerinden eşleştirmeleri gerçekleştirecek.
    @Id
    //Bu ID alanı'nın otomatik olarak birer birer artmasını sağladık.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    
    public Category(long id, String name) {
        this.id = id;
        this.name = name;
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
    
    
}
