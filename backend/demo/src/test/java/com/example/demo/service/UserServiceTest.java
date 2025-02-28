package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.User;
import com.example.demo.service.impl.UserServiceImpl;

@SpringBootTest
public class UserServiceTest {
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@Test
	public void addUserTest() {
		User user1 = new User("Harry", "Osborne","the123", "gob123", "New York City", "harry@goblin.com", "0451073088", false);
		User user2 = new User("Peter", "Parker","spid123", "man123", "Queens, New York City", "spider@man.com", "123123123", false);
		User user3 = new User("Richard", "Chao","15chaorh1", "password", "2 Menzies Rd. Marsfield 2122", "richardchao2009@gmail.com", "0450287263", true);
		userServiceImpl.addUser(user1);
		userServiceImpl.addUser(user2);
		userServiceImpl.addUser(user3);
	}
	
	//@Test
	public void getAllUserTest() {
		List<User> list = userServiceImpl.getAllUser();
		for (User user : list) {
			System.out.println(user.getFirstName());			
		}
		
	}
	
	//@Test
	public void findUserByUserIdTest() {
		List<User> list = userServiceImpl.findUserByUserId(4);
		User user = list.get(0);
		System.out.println(user.getFirstName());
		
	}
	
	@Test
	public void existTest() {
		assertTrue(userServiceImpl.exist("15chaorh1", "password"));
		assertFalse(userServiceImpl.exist("15chaorh1", "pass"));
		
	}
	
	//@Test
	public void updateUserTest() {
		userServiceImpl.updateUser(4, "Steve", "Jobs","apple", "watch", "California", "Steve@jobs.com", "88888888");
	}
	
	//@Test
	public void removeUserTest() {
		userServiceImpl.removeUser(3);
	}
	
	
}
