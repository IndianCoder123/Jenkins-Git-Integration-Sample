package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService implements IProductService{

@Autowired
@LoadBalanced
protected RestTemplate restTemplate;

@Override
public List<Product> findAll() {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		products.add(new Product(100, "Mobile", "CLK98123", 9000.00, 6));  
		products.add(new Product(101, "Smart TV", "LGST09167", 60000.00, 3));  
		products.add(new Product(102, "Washing Machine", "38753BK9", 9000.00, 7));  
		products.add(new Product(103, "Laptop", "LHP29OCP", 24000.00, 1));  
		products.add(new Product(104, "Air Conditioner", "ACLG66721", 30000.00, 5));  
		products.add(new Product(105, "Refrigerator ", "12WP9087", 10000.00, 4));  
		return products	;
	}

/*@Override
public List<Product> findAll() {
	// TODO Auto-generated method stub		
			List<Product> products = new ArrayList<>();
			products.add(new Product(100, "Mobile", "CLK98123", 9000.00, 6));  
			products.add(new Product(101, "Smart TV", "LGST09167", 60000.00, 3));  
			products.add(new Product(102, "Washing Machine", "38753BK9", 9000.00, 7));  
			products.add(new Product(103, "Laptop", "LHP29OCP", 24000.00, 1));  
			products.add(new Product(104, "Air Conditioner", "ACLG66721", 30000.00, 5));  
			products.add(new Product(105, "Refrigerator ", "12WP9087", 10000.00, 4));
			Product product=restTemplate.getForObject("/product",Product.class,products);
			
			return product;
			//return  restTemplate.getForObject("http://localhost:8080/product", List.class,products);
			//return restTemplate.getForObject("/product",List.class,products);
			//return restTemplate.exchange("/product", HttpMethod.GET,List<Product>,products);
					
 }*/
}
