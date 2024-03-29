package com.booksales.service;

import com.booksales.model.User;

public interface UserServiceI {
	
	User getUserById(String id);
	/**
	 * 根据email和password 判断是否可以登陆
	 * @param email
	 * @param password
	 * @return
	 */
	User login(String email,String password);
	/**
	 * 用户注册
	 * @param user
	 */
	void register(User user);
}
