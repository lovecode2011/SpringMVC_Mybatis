package com.booksales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.booksales.service.OrderServiceI;

@Controller
@RequestMapping()
public class OrderController {
	@Autowired
	OrderServiceI orderService;
	@RequestMapping(value = "listCart/addOrder", method = RequestMethod.POST)
	public String addOrder( @RequestParam Integer[] cart_id){
		
		System.out.println(cart_id);
		for(Integer i:cart_id)
			System.out.println(i);
		return "";
		
	}
}
