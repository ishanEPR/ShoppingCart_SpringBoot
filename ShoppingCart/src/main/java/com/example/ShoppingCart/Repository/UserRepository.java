package com.example.ShoppingCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShoppingCart.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
