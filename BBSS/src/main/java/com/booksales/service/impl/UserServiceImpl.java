package com.booksales.service.impl;
import java.io.IOException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.controller.UserController;
import com.booksales.dao.UserMapper;
import com.booksales.model.User;
import com.booksales.service.UserServiceI;
import com.booksales.util.AESUtil;
  
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

	public User getUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * 根据传入的email，password，返回user对象
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 */
	public User login(String email,String password) throws JsonGenerationException, JsonMappingException, IOException {
		User result=null;
		User user=userMapper.loginSelectPassword(email);
		String pwd = user.getPassword();
		ObjectMapper mapper = new ObjectMapper();
		logger.info("loginUser==》"+mapper.writeValueAsString(user));
		
		String s = AESUtil.AESdecrypt(pwd);
		
		System.out.println(s);
		
		if(password.equals(s)){
			result = user;
		}
		return result;
			
	}

	/**
	 * 用户注册
	 */
	public int register(User user) {
		
		String pass = user.getPassword();
		pass= AESUtil.AESencrypt(pass);
		user.setPassword(pass);
		user.setIsroot("0");
		return userMapper.insert2(user);
	}
	@Override
	public List<User> userList() {
		
		return userMapper.selectAll();
	}

	@Override
	public User ValidateUserName(String username) {
		 
		return userMapper.selectUserName(username);
	}

	@Override
	public User ValidateEmail(String email) {
		return userMapper.selectUserByEmail(email);
	}


	

}
