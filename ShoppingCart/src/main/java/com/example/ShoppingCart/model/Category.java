package com.example.ShoppingCart.model;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="category")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

	@Id
	private long id;
	private String name;
}
