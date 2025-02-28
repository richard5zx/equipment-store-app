package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
@CrossOrigin
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	// C
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	// R
	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}
	
	@Override
	public List<User> findUserByUserId(int user_id) {
		return userRepository.findById(user_id);
	}
	
	@Override
	public boolean exist(String username, String password) {
		List<User> list = userRepository.findByUsernameAndPassword(username, password);
		if (list.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	// U
	@Override
	public void updateUser(int user_id, String first_name, String last_name, String username, String password, String address, 
			String email, String contact_number) {
		List<User> list = userRepository.findById(user_id); 
		User user = list.get(0);
		user.setFirstName(first_name);
		user.setLastName(last_name);
		user.setUsername(username);
		user.setPassword(password);
		user.setAddress(address);
		user.setEmail(email);
		user.setContactNumber(contact_number);
		userRepository.save(user);
		
	}
	
	// D
	@Override
	public void removeUser(int user_id) {
		userRepository.deleteById(user_id);
		
	}
	
	
}
