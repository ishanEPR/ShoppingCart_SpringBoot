package com.example.ShoppingCart.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/user")
	public ResponseEntity<?> checkLogin() {
		System.out.println("inside user");
		return ResponseEntity.ok("test");
		
	}

}
