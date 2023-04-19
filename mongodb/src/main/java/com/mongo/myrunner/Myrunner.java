package com.mongo.myrunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mongo.model.Mongo;
import com.mongo.myrepository.Myrepository;

@Component
public class Myrunner implements CommandLineRunner {
	@Autowired
	Myrepository myrepo;

	@Override
	public void run(String... args) throws Exception {
		myrepo.save(new Mongo("vivo",1023));
	}
	
}
