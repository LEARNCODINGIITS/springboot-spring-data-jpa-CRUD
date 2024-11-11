package com.iits.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iits.main.entity.Product;
import com.iits.main.service.ProductService;

@RestController
@RequestMapping("/api/")
public class MyProductController {

	@Autowired
	ProductService productService;
	
	
	@PostMapping("products")
	public Product saveProduct(@RequestBody Product product) {
		return this.productService.save(product);
		
	}
	
	@GetMapping("products")
	public List<Product> findProducts(){
		return this.productService.findAllProducts();
	}
	
	
	
	
}
