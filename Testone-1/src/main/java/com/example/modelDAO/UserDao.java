package com.example.modelDAO;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.User;


@Mapper
public interface UserDao {
	
	public User findUserByPhone(String phone);
	public boolean insertUser(User user);
	
	public List<User> findListUserByPhone(String phone);
	
	
	
	
}
