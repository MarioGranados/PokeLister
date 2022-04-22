package com.example.pokelister.repositories;

import com.example.pokelister.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<User, Long> {

}
