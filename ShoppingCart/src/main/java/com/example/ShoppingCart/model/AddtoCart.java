package com.example.ShoppingCart.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="add_to_cart")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddtoCart {
	@Id
	private long id;
	private long product_id;
	private int qty;
	private double price;
	private String added_date;


}
