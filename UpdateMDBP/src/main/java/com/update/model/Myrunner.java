package com.update.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myrunner {
	@Autowired
     Myservice sr;
	
	@PostMapping("/insert")
	public void adddata(@RequestBody Updating upp) {
		sr.adddata(upp);
	}
	
	@GetMapping("/get")
	public List<Updating> getData(){
		return sr.getdata();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Updating> getbyid(@PathVariable int id){
		return sr.getbyid(id);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deletebyid(@PathVariable int id) {
		sr.deletebyid(id);
		return "successfully deleted";
	}
	
	/*@PutMapping("/update/{id}")
		public String updatedata(@PathVariable int id,@RequestBody Updating upp) {
		sr.updatingdata(id, upp);
        return "updated successfully";																																					
	}*/
	@PutMapping("/update/{id}")
	public void updatedata(@PathVariable int id,@RequestBody Updating upp) {
		sr.updatingdata(id, upp);
		
	}
	
		
}
