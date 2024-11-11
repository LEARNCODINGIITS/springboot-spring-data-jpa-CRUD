package com.iits.main.controller;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iits.main.entity.Product;
import com.iits.main.entity.Product1;
import com.iits.main.service.ProductService;
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	/*@PostMapping("/save")
	//@RequestMapping(path="/save", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Product saveProduct(@RequestBody Product product) {
		System.out.println(product);
		return this.productService.saveProduct(product);
		//return this.productService.saveProduct(product);

	}*/
	
	@GetMapping("/msg")
	public String message() {
		return "Welcome to RESTAPI";
	}
	//@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/product")
	//@GetMapping(path = "/product",produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	//@RequestMapping(path="/product",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Product product() {
		Product product=new Product();
		product.setId(1);
		product.setName("ABC");
		product.setPrice(3000);
		product.setQt(10);
		return product;
	}

}
