package com.booksales.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
		logger.info("用户登录");
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login2(HttpServletRequest request) throws JsonGenerationException, JsonMappingException, IOException {
            String email = request.getParameter("email").trim();
            String password = request.getParameter("password").trim();
            String verifycode = (String)request.getSession().getAttribute("validateCode");
            String checkcode = request.getParameter("checkcode").trim();
            logger.info("邮箱:===>"+email);
            logger.info("密码:===>"+password);
            User u = userService.login(email,password);
            
            ObjectMapper mapper = new ObjectMapper();
            logger.info(mapper.writeValueAsString(u));
            
            String checkbox =request.getParameter("checkbox");
            System.out.println(verifycode);
          
            System.out.println(checkcode);
            if(checkbox==null){
            	checkbox="off";
            }
            System.out.println(checkbox);
           
        return "showUser2";
    }

}
