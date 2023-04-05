package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.user1.User;
import com.user1.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private TestEntityManager entitymanager;
	
	@Test
	public void testCreateUser() {
		User user = new User();
		user.setEmail("chiragrajbr@gmail.com");
		user.setPassword("chirag9591");
		user.setFirstname("chirag");
		user.setLastname("raj");
		
		User savedUser=repo.save(user);
		
		User existUser=entitymanager.find(User.class,savedUser.getId());
		
		assertThat(existUser.getEmail()).isEqual
		
		
		
	}
	

}
