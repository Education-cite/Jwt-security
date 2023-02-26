package com.security.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.jwt.dao.ProductDao;
import com.security.jwt.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public Product addNewProduct(Product product) {
		return productDao.save(product);
	}
	
	
	public List<Product> getAllProducts(){
		return productDao.findAll();
		
	}
	
	
	
	
	
	

}
