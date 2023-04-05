package com.user1;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")


public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	@Column(nullable=false , unique=true ,length = 45)	
	
	private String password;
	@Column(nullable=false , unique=true ,length = 45)
	
	
	private String email;
	@Column(nullable=false , unique=true ,length = 45)
	
	private String firstname;
	@Column(nullable=false , unique=true ,length = 45)
	
	private String lastname;
	@Column(nullable=false , unique=true ,length = 45)
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}

