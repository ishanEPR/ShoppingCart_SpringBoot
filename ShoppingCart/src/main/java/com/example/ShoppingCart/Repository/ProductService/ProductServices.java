package com.example.ShoppingCart.Repository.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ShoppingCart.Repository.ProductRepository;
import com.example.ShoppingCart.model.Products;

@Service
public class ProductServices {
	
	@Autowired
	ProductRepository productRepository;
	public List<Products> getAllProducts()
	{
		return productRepository.findAll();
	}

}
