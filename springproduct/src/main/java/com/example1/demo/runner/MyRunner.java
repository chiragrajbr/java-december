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
		
		repo.save(new Product(101,"chirag",1234));
		System.out.println("executed");
		
	}

}
