 package com.example.ShoppingCart.model;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	private long id;
	private String name,email,password,
	created_at,
	login_token,
	type,
	address,
	is_email_verified,
	mobile;
}
