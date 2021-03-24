package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

@Autowired
//@Qualifier
private ProductService productService;

@RequestMapping(value = "/")
public String home() {
System.out.println("Calling test");
return "Eureka Client application";
}
		
@GetMapping(value = "/product") 
public List<Product> getProduct() { 
System.out.println("Calling product test");
List<Product> products = productService.findAll(); 
return products; 
 }
}
