package com.security.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
	
	
	public Product getProductDetailsById( Integer productId) {
		return productDao.findById(productId).get();

	}
	
	
	public void deleteProduct(Integer productId) {
		productDao.deleteById(productId);
	}
	
	
	

}
