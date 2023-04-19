package com.mongo.myrepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.model.Mongo;

@Repository
public interface Myrepository extends MongoRepository<Mongo, Integer> {

}
