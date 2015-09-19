package com.booksales.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.booksales.model.Book;
import com.booksales.model.User;
import com.booksales.service.BookServiceI;
import com.booksales.service.UserServiceI;

@Controller
@RequestMapping()
public class UserController {
	private UserServiceI userService;
	@Autowired
	BookServiceI bookService;
	private static Log logger = LogFactory.getLog(UserController.class);

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}
	@RequestMapping()
	public String showHome() {
		
		return "user/login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		logger.info("用户登录");
		
		return "user/login";
	}
	

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login2(HttpServletRequest request,
			HttpServletResponse response,HttpSession httpSession) throws JsonGenerationException,
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
			
			if("1".equals(u.getIsroot())){
				httpSession.setAttribute("admin", u);
				List<Book> booklist = bookService.bookList();
				httpSession.setAttribute("booklist", booklist);
				List<User> userlist =userService.userList();
				httpSession.setAttribute("userlist", userlist);
				return "user/showAdmin";
			}
			else{
				httpSession.setAttribute("user", u);
				return "user/showUser";
			}
		}
		
		
		return "showUser";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		logger.info("用户注册");
		return "user/register";
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register2(User user,Model model) throws JsonGenerationException, JsonMappingException, IOException {
		
		
		logger.info("用户注册开始");
		int i =userService.register(user);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(user));
		logger.info("用户注册成功");
		if(i==1){
			model.addAttribute("register", i);
		}
		
		return "user/register";
	}
	
	
}
