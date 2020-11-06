package com.shop.service;

import com.shop.dto.User;

public interface UserService {

	void addUser(User user);
	boolean findUser(User user);
	String forgotPassword(String userName);
}
