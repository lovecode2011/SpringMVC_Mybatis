package com.booksales.service.impl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.controller.LoginController;
import com.booksales.dao.UserMapper;
import com.booksales.model.User;
import com.booksales.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI {
	
	private UserMapper userMapper;
	private static Log logger = LogFactory.getLog(UserServiceImpl.class); 
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

	@Override
	public User login(String email,String password) {
		User result=null;
		logger.info(result);
	  User user=userMapper.loginSelectPassword(email);
		logger.info(user);
		if(password.equals(user.getPassword())){
			result = user;
		}
		return result;
			
	}


	

}
