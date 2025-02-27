package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	
	// C
	public void addUser(User user);
	
	// R
	public List<User> getAllUser();
	public List<User> findUserByUserId(int user_id);
	
	// U
	public void updateUser(int user_id, String first_name, String last_name, String address, String email, String contact_number);
	
	// D
	public void removeUser(int user_id);

}
