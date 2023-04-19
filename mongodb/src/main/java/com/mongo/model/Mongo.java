package com.mongo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public class Mongo {
	@Id
	private String id;
	private String prodname;
	private int  prodprice;
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public int getProdprice() {
		return prodprice;
	}
	public void setProdprice(int prodprice) {
		this.prodprice = prodprice;
	}
	
	
	
	public Mongo() {
		super();
	}
	public Mongo(String id, String prodname, int prodprice, String prodcolor) {
		super();
		this.id = id;
		this.prodname = prodname;
		this.prodprice = prodprice;
		
	}
	public Mongo(String prodname, int prodprice, String prodcolor) {
		super();
		this.prodname = prodname;
		this.prodprice = prodprice;
		
	}
	
}
