package com.capg.springrest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class AppController {

@RequestMapping("/showPage")
public String showPage() {
	return "register-product";
	
}

@RequestMapping("/viewPage")
public String viewPage()
{
	return "find-product";
}

@RequestMapping("/addProduct")
public String addProduct(@ModelAttribute("product") Product product,ModelMap modelMap)
 {
	String uri="http://localhost:8081/RestfulServerApp4/products";
	RestTemplate restTemplate=new RestTemplate();
	Product savedProduct=restTemplate.postForObject(uri, product,Product.class);
	modelMap.addAttribute("msg","Product is added Successfully with id"+savedProduct.getId());
	return "register-product";	
 }

@RequestMapping("/viewProduct")
public String getProduct(@RequestParam("id")int id,ModelMap map)
{
	String uri="http://localhost:8081/RestfulServerApp4/products";
	RestTemplate template=new RestTemplate();
	Product product=template.getForObject(uri+"/"+id,Product.class);
	map.addAttribute("product",product);
	return "show-product";
}

}


