package com.example.ShoppingCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShoppingCart.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
