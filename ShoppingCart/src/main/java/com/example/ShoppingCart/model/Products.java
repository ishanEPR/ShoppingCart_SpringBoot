package com.example.ShoppingCart.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
	
	@Id
	private long id;
	private String name,price,added_on,category_id;
	
	
	

}
