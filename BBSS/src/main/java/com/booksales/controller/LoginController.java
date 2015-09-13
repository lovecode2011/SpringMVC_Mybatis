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
            String username = request.getParameter("email").trim();
            System.out.println(username);
        return "showUser2";
    }

}
