package com.mongo2.myrunner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo2.model.Model;
import com.mongo2.service.ProductService;

@RestController
public class Myrunner {
	@Autowired
	ProductService ps;
	
	@PostMapping("/insert")
	public String  adduser(@RequestBody Model model) {
		ps.save(model);
		return "successfully added" ;
	}
	
	@GetMapping("/get")
	public List<Model> getdata(){
		return ps.findAll();
	}
	
	
	
	
}
