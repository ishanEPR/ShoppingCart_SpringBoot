package com.example.ShoppingCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShoppingCart.model.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
