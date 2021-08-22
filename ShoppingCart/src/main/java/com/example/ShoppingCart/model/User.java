 package com.example.ShoppingCart.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	long id;
	String name,email,password,
	created_at,
	login_token,
	type,
	address,
	is_email_verified,
	mobile;
}
