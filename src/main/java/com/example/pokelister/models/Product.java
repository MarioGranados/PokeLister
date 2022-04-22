package com.example.pokelister.models;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 45)
    private String name;

    @Column(nullable = false, length = 100)
    private String description;

    @Column(nullable = false, precision = 0)
    private long price;

    @Column(nullable = false)
    private long quantity;

    public Product(){
    }

    public Product(String name, String description, long price, long quantity){
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

}