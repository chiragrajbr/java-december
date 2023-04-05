package com.jpadb.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpadb.model.Product;
import com.jpadb.model.Productrepo;

@Component
public class Myrunner implements CommandLineRunner {

	@Autowired
	Productrepo pr;
	
	@Override
	public void run(String... args) throws Exception {
	Product p=new Product();
	p.setId(01);
	p.setName("vivo");
	p.setAmount(12000);
	pr.save(p);
	//pr.deleteAll();
		
	}

}
