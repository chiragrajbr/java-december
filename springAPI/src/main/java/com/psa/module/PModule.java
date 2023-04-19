package com.psa.module;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psa.api.Api;
import com.psa.service.PService;

@RestController
public class PModule {
	
	@Autowired
	PService ps;
	
	@PostMapping("/insert")
	public void add_data(@RequestBody Api a) {
		ps.insert_data(a);
	} 
	
	@GetMapping("/get")
	public List<Api> fetchdata(){
		return ps.view();
	}
	
	@DeleteMapping("/delete")
	public void delete() {
		ps.del();	}	
	

}
