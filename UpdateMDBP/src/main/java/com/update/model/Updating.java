package com.update.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Document
public class Updating {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	private String eName;
	private int ePrice;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getePrice() {
		return ePrice;
	}
	public void setePrice(int ePrice) {
		this.ePrice = ePrice;
	}
	
	
	
	
	
	
}
