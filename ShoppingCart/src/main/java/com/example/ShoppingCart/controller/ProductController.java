package com.example.ShoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShoppingCart.Repository.ProductService.ProductServices;
import com.example.ShoppingCart.model.Products;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductServices productServices;
	
	@RequestMapping("/getAll")
	public List<Products> getAllProducts(){
		return productServices.getAllProducts();
	}

}
