package com.mongo.myrunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mongo.repository.Myrepository;
import com.mongodb.model.Mongo;
@Component

public class Myrunner implements CommandLineRunner {
@Autowired
	Myrepository repo;
	
	@Override
	public void run(String... args) throws Exception {
	repo.save(new Mongo("mi",1236))	;
		
	}

}
