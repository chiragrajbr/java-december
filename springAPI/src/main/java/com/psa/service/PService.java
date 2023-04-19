package com.psa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psa.api.Api;
import com.psa.repository.Myrepository;

@Service
public class PService {

	@Autowired
	Myrepository repo;
	
	public void insert_data(Api a) {
		repo.save(a);
	}
	
	
	public List<Api> view(){
		return repo.findAll();
	}
	
	public void del() {
		 repo.deleteAll();
	}
}
