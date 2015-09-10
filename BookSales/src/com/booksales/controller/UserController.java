package com.booksales.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.booksales.model.User;
import com.booksales.service.IUserService;



@Controller
@RequestMapping("/user")
public class UserController {
	@Resource(name="userService")
	private IUserService userService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable int userId){
		User user = userService.getUserById(userId);
		modelMap.addAttribute("user", user);
		return "/user/showUser";
	}
	
	@RequestMapping("/showUsers")
	public @ResponseBody Object showUserInfos(){
		List<User> userInfos = userService.getUsers();
		return userInfos;
	}
}
