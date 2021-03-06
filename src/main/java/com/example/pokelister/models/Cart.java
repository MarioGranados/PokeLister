package com.example.pokelister.models;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long user_id;

    @OneToOne
    private Product product;

    public Cart(){}

    public Cart(long user_id, Product product) {
        this.product = product;
        this.user_id = user_id;
    }

    public Cart(long user_id) {
        this.user_id = user_id;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
