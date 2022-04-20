package com.example.pokelister.models;

import javax.persistence.*;

@Entity
@Table(name = "ads")
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 45)
    private String title;

    @Column(nullable = false, length = 100)
    private String description;

    public Ad(){
    }

    public Ad(String title, String description){
        this.description = description;
        this.title = title;
    }

}