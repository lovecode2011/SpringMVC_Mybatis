package com.booksales.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.dao.UserMapper;
import com.booksales.model.User;
import com.booksales.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI {
	
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User getUserById(String id) {
		Integer i = Integer.parseInt(id);
		return userMapper.selectByPrimaryKey(i);
	}


	

}
