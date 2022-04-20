package com.example.pokelister.repositories;

import com.example.pokelister.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
    User findUserByUsernameAndPassword(String username, String password);


}
