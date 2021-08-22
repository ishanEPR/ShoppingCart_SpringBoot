package com.example.ShoppingCart.model;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
	
	@Id
	private long id;
	private String name,price,added_on,category_id;
	
	
	

}
