package com.shop.dao;

import com.shop.dto.User;

public interface UserDao {
	void insertUser(User user);
	boolean checkUser(User user);
	String forgotPassword(String userName);
	
}
