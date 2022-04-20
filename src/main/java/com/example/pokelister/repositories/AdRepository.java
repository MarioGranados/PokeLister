package com.example.pokelister.repositories;

import com.example.pokelister.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad, Long> {
}
