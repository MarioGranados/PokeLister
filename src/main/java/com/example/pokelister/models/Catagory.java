package com.example.pokelister.models;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Controller
@Table(name = "catagories")
public class Catagory {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    
    @Column
    private String catagoryName;

    @OneToOne
    private Product product;

    public Catagory() {}

    public Catagory(String catagoryName) {this.catagoryName = catagoryName;}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCatagoryName() {
        return catagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName;
    }

    //reference
    
    
    
}

