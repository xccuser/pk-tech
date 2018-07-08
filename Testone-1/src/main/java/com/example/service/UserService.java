package com.example.service;


import java.util.List;

import com.example.model.User;

public interface UserService {
	public User findUserByPhone(String phone);
	public boolean insertUser(User user);
	
	public List<User> findListUserByPhone(String phone);
	
}