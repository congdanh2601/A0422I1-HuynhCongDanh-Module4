package com.example.shopping_cart.repository;

import com.example.shopping_cart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
