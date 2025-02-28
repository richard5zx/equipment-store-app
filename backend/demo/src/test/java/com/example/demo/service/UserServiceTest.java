package com.example.demo.service;

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
		User user1 = new User("Harry", "Osborne", "New York City","the123", "gob123", "harry@goblin.com", "0451073088", false);
		User user2 = new User("Peter", "Parker", "Queens, New York City","spid123", "man123", "spider@man.com", "123123123", false);
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
	
	//@Test
	public void updateUserTest() {
		userServiceImpl.updateUser(4, "Steve", "Jobs","apple", "watch", "California", "Steve@jobs.com", "88888888");
	}
	
	//@Test
	public void removeUserTest() {
		userServiceImpl.removeUser(3);
	}
	
	
}
