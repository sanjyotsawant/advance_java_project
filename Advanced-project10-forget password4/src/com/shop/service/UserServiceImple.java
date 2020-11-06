package com.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.User;
import com.shop.dao.UserDao;

@Service
public class UserServiceImple implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
		
	}

	@Override
	public boolean findUser(User user) {
		return userDao.checkUser(user);
	}

	@Override
	public String forgotPassword(String userName) {
		// TODO Auto-generated method stub
		return userDao.forgotPassword(userName);
	}

}
