package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.impl.UserServiceImpl;

@SpringBootTest
public class UserRepositoryTest {
	@Autowired
	UserRepository userRepository;
	
	
}