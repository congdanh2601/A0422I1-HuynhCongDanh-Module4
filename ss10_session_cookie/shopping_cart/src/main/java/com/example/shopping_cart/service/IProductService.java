package com.example.shopping_cart.service;

import com.example.shopping_cart.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(Long id);
}
