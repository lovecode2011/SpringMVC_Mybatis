package com.booksales.service;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.booksales.model.User;

public interface UserServiceI {
	
	User getUserById(String id);
	/**
	 * 根据email和password 判断是否可以登陆
	 * @param email
	 * @param password
	 * @return
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 */
	User login(String email,String password) throws JsonGenerationException, JsonMappingException, IOException;
	/**
	 * 用户注册
	 * @param user
	 * @return 
	 */
	int register(User user);
	
	/**
	 * 查询所有的user
	 * @return
	 */
	List<User> userList();
	
}
