package com.example.ShoppingCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShoppingCart.model.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
