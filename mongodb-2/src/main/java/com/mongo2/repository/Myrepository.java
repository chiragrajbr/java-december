package com.mongo2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo2.model.Model;


@Repository

public interface Myrepository extends MongoRepository<Model, String> {

	

}
