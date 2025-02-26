package com.example.High_Performance.Inventory.Management.System.repository;

import com.example.High_Performance.Inventory.Management.System.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE p.category = ?1")
    List<Product> findByCategory(String category);

    @Query(value = "SELECT * FROM products WHERE price > :price ORDER BY created_at DESC LIMIT 10", nativeQuery = true)
    List<Product> findTopExpensiveProducts(BigDecimal price);
}
