package com.example.ShoppingCart.model;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity(name="orders")
public class Order {
	
	@Id
	private long id;
	private String order_id;
	private long product_id;
	private int qty;
	private double price;
	private String order_on;
	private int status;//status of the code
}
