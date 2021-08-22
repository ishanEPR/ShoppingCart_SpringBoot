package com.example.ShoppingCart.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
