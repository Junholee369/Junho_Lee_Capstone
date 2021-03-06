package com.example.Inventory_Management_Capstone.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Inventory_Management_Capstone.Entity.User;
import com.example.Inventory_Management_Capstone.Repository.UserRepository;


@SpringBootTest
public class UserServiceTest {

	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public UserService userService;
	
	@Test
	void testUser() throws Exception{
		User testUser= new User();
		testUser.setFirstName("testman");
		testUser.setLastName("testlast");
		testUser.setEmail("test@Email.com");
		testUser.setPassword("123456");
		
		userRepository.save(testUser);
		
		userService.loadUserByUsername("test@Email.com");
		
		assertEquals("test@Email.com", testUser.getEmail());
		userRepository.delete(testUser);
	}
	
	
	
}
