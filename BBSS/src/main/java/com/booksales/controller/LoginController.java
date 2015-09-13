package com.booksales.controller;

import javax.servlet.http.HttpServletRequest;

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

	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login2(HttpServletRequest request) {
            String email = request.getParameter("email").trim();
            String password = request.getParameter("password").trim();
            String verifycode = (String)request.getSession().getAttribute("validateCode");
            String checkcode = request.getParameter("checkcode").trim();
            
            String checkbox =request.getParameter("checkbox");
            System.out.println(verifycode);
            System.out.println(email);
            System.out.println(password);
            System.out.println(checkcode);
            if(checkbox==null){
            	checkbox="off";
            }
            System.out.println(checkbox);
           
        return "showUser2";
    }

}
