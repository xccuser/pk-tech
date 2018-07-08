package com.example.service.Imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.modelDAO.UserDao;
import com.example.service.UserService;


@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserDao userdao;

	@Override
	public User findUserByPhone(String phone) {
		return userdao.findUserByPhone(phone);
	}

	@Override
	public boolean insertUser(User user) {
		return userdao.insertUser(user);
	}

	@Override
	public List<User> findListUserByPhone(String phone) {
		return userdao.findListUserByPhone(phone);
	}

}
