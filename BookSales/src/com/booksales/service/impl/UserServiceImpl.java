package com.booksales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.dao.mapper.UserMapper;
import com.booksales.model.User;
import com.booksales.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userDao;
	@Override
	public User getUserById(int userId) {
		return userDao.selectByUserId(userId);
	}

	@Override
	public List<User> getUsers() {
		return userDao.selectAll();
	}

}
