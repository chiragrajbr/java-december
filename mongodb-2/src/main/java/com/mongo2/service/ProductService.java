package com.mongo2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo2.model.Model;
import com.mongo2.repository.Myrepository;

@Service
public class ProductService {
	@Autowired
	Myrepository mrepo;

	public void save(Model model) {
		
		mrepo.save(model);
		
	}

	public List<Model> findAll() {
		
		return mrepo.findAll();
	}
	
	
}
