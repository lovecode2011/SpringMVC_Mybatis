package com.booksales.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.booksales.model.User;
import com.booksales.service.UserServiceI;

@Controller
@RequestMapping()
public class LoginController {
	private UserServiceI userService;
	private static Log logger = LogFactory.getLog(LoginController.class);

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}
	@RequestMapping()
	public String showHome() {
		
		return "index";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		logger.info("用户登录");
		return "login";
	}
	

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login2(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// 获取emial
		String email = request.getParameter("email").trim();
		// 获取password
		String password = request.getParameter("password").trim();
		// 获取验证码code
		String verifycode = (String) request.getSession().getAttribute(
				"validateCode");
		// 获取输入的验证码
		String checkcode = request.getParameter("checkcode").trim().toUpperCase();
		// 是否记住密码
		String checkbox = request.getParameter("checkbox");
		
		// 判断验证码是否正确
		if (checkcode.equals(verifycode)) {
			logger.info("验证码正确==》" + checkcode);

			User u = userService.login(email, password);
			ObjectMapper mapper = new ObjectMapper();
			logger.info(mapper.writeValueAsString(u));
			if("1".equals(u.getIsroot())){
				return "showAdmin";
			}
		}
		
		// 创建两个Cookie对象
		Cookie nameCookie = new Cookie("email", email);
		Cookie pwdCookie = new Cookie("password", password);
		// 如果点击了记住密码
		if (checkbox != null) {
			nameCookie.setMaxAge(60 * 60 * 24 * 3);
			pwdCookie.setMaxAge(60 * 60 * 24 * 3);
			response.addCookie(nameCookie);
			response.addCookie(pwdCookie);
		}
		// 否则清空cookie
		else {
			checkbox = "off";
			nameCookie.setMaxAge(1);
			pwdCookie.setMaxAge(1);
			response.addCookie(nameCookie);
			response.addCookie(pwdCookie);
		}
		return "showUser";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		logger.info("用户注册");
		return "register";
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register2(User user,Model model) throws JsonGenerationException, JsonMappingException, IOException {
		
		
		logger.info("用户注册开始");
		userService.register(user);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(user));
		
		return "showUser";
	}
	
	@RequestMapping(value = "/addReceiver", method = RequestMethod.GET)
	public String addReceiver() {
		logger.info("用户注册");
		return "receiver/addReceiver";
	}
	@RequestMapping(value = "/addReceiver", method = RequestMethod.POST)
	public String addReceiver2(User user,Model model) throws JsonGenerationException, JsonMappingException, IOException {
		
		
		logger.info("用户注册开始");
		userService.register(user);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(user));
		
		return "showUser";
	}
	
	@RequestMapping(value = "/GetDateJson", method = RequestMethod.GET)
	@ResponseBody
	public String GetDateJson(){
		
		FileReader fr = null;
		try {
			fr = new FileReader("O:\\picc\\Json\\globalData.min.json");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String datajson= new String();
        //可以换成工程目录下的其他文本文件
        BufferedReader br=new BufferedReader(fr);
        try {
			while(br.readLine()!=null){
			     datajson=br.readLine();
			    System.out.println(datajson);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return datajson;
		
	}

}
