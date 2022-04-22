package com.example.pokelister.repositories;

import com.example.pokelister.models.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatagoryRepository extends JpaRepository<Catagory, Long> {
    Catagory findAllByCatagoryName(String catagoryName);

}
