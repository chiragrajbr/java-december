package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.model.Mongo;
@Repository
public interface Myrepository extends MongoRepository<Mongo, Integer> {

}