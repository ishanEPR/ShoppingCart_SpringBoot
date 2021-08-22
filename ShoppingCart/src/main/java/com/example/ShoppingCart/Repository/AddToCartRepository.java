package com.example.ShoppingCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShoppingCart.model.AddtoCart;

public interface AddToCartRepository extends JpaRepository<AddtoCart, Long> {

}
