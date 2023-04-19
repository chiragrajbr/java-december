package com.update.model;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Myservice {
	

	@Autowired
	Myrepository mrepo;
	
	
	
	public void adddata(Updating up) {
		mrepo.save(up);
	}
	
	public List<Updating> getdata(){
		return mrepo.findAll();
	}
	public Optional<Updating> getbyid(int id){
		return mrepo.findById(id);
	}
	
	public void deletebyid(int id) {
		mrepo.deleteById(id);
		
	}
	
	/*public void updatingdata(int id,Updating up) {
		Updating reciving=mrepo.getByeId(id);
		reciving.seteName(up.geteName());
		reciving.setePrice(up.getePrice());
		mrepo.save(reciving);
	}*/
	public void updatingdata(int id,Updating up) {
		Updating reciving=mrepo.getByeId(id);
		reciving.seteName(up.geteName());
		reciving.setePrice(up.getePrice());
		mrepo.save(reciving);
	}
	
	
	}

