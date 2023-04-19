package com.example1.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example1.demo.product.Product;
import com.example1.demo.repository.ProductRepository;

@Component
public class MyRunner implements CommandLineRunner {

		@Autowired
		ProductRepository repo;

		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			
			 Product p=new Product();
			 p.setId(101);
			 p.setName("vivo");
			 p.setPrice(10000);
			 
			 repo.save(p);
			
		}
		
	
		
	

}
