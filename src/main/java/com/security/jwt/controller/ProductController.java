package com.security.jwt.controller;

import java.awt.PageAttributes;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.security.jwt.entity.ImageModel;
import com.security.jwt.entity.Product;
import com.security.jwt.service.ProductService;

@RestController
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PreAuthorize("hasRole('Admin')")
	@PostMapping(value ={"/addNewProduct"},consumes= {org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE})

	public Product addNewProduct(@RequestPart("product") Product product,@RequestPart("imageFile") MultipartFile[] file) {
		//return productService.addNewProduct(product);
		
		try{
			Set<ImageModel> images = uploadImage(file);
			product.setProductimages(images);
			return productService.addNewProduct(product);

		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
		
	}
	
	
	public Set<ImageModel> uploadImage(MultipartFile[] multipartFiles) throws IOException{
		Set<ImageModel> imageModels = new HashSet<>();
		
		for(MultipartFile file:multipartFiles){
		ImageModel imageModel = new ImageModel(
				file.getOriginalFilename(),
				file.getContentType(),
				file.getBytes()
				
				);
		
		imageModels.add(imageModel);
		
		}
		
		return imageModels;
		
	}
	
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
		
	}
	
	@DeleteMapping("/deleteProduct/{productId}")
	public void deleteProduct(@PathVariable("productId") Integer productId) {
		productService.deleteProduct(productId);
	}
	

}
