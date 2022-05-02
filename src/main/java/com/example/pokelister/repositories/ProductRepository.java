package com.example.pokelister.repositories;
import com.example.pokelister.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * FROM products WHERE catagory_id = ?1", nativeQuery = true)
    List<Product> findByCategoryId(@Param("id")long id);
}
