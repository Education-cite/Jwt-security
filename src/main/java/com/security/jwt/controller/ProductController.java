package com.security.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.jwt.entity.Product;
import com.security.jwt.service.ProductService;

@RestController

public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping({"/addNewProduct"})
	public Product addNewProduct(@RequestBody Product product) {
		return productService.addNewProduct(product);
	}
	
	
	
	
	

}
