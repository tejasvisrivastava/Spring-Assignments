package com.capg.springboot.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.capg.springboot.entities.Product;

@Service
public class ProductServiceImpl implements ProductService
{
  public static List<Product> products=new ArrayList<>();
  
  static 
  {
	  Product p1 = new Product(101,"Windows 10 PRO",8000);
      Product p2 = new Product(102,"Ubuntu 18.04 Desktop",56000);
      Product p3 = new Product(103,"Linux Mint 19",670.5);
      
      products.add(p1);
      products.add(p2);
      products.add(p3);
  }
	
 @Override
 public Product addProduct(Product product)
 {
	 products.add(product);
	 return product;
 }
	
 @Override
 public Product getProduct(int id)
 {
	 Product product=null;
	 for(Product p:products)
	 {
		 if(p.getId()==id)
		 {
			 product=p;
			 break;
		 }
	 }
	 return product;
 }
 
 
 @Override 
 public List<Product> getAllProduct()
 {
	 return products;
 }

}
