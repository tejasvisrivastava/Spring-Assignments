package com.capg.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.entities.Product;
import com.capg.springboot.service.ProductService;
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping(value="/products", consumes= {"application/json"}, produces= {"application/json"})
	public Product addProduct(@RequestBody Product product)
	{
		return productService.addProduct(product);
	}
	@GetMapping(value="/products/{id}",produces= {"application/json"})
	//@ResponseStatus(HttpStatus.NOT_FOUND)
	public Product getProduct(@PathVariable("id") int id) 
	{
		Product product=productService.getProduct(id);
		
		/*if(product==null)
		{
			System.out.println("Product is not found for thr given Id: "+id);
		}*/
		return product;
	}
	@GetMapping(value="/products",produces={"application/json"})
	public List<Product> getAllProducts()
	{
		return productService.getAllProduct();
	}
		
}