package com.booksales.service;

import com.booksales.model.User;

public interface UserServiceI {
	User getUserById(String id);

	User login(String email,String password);

	void register(User user);
}
