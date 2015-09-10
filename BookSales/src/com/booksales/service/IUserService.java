package com.booksales.service;

import java.util.List;

import com.booksales.model.User;

public interface IUserService {

	User getUserById(int userId);

	public List<User> getUsers();

}
