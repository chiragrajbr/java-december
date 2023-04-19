package com.update.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface Myrepository extends MongoRepository<Updating,Integer>{
	
	 //  public Updating getByeId(@PathVariable int id);
	//Updating  getByeId(@PathVariable int id);
	public Updating getByeId(@PathVariable int id);
	
	
}
