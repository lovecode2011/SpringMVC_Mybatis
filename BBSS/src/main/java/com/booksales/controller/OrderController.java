package com.booksales.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.booksales.model.Receiver;
import com.booksales.model.User;
import com.booksales.service.OrderServiceI;
import com.booksales.service.ReceiverServiceI;

@Controller
@RequestMapping()
public class OrderController {
	@Autowired
	OrderServiceI orderService;
	@Autowired
	ReceiverServiceI receiverService;
	
	@RequestMapping(value = "listCart/addOrder", method = RequestMethod.POST)
	public String addOrder( @RequestParam Integer[] cart_id,HttpServletRequest request){
		
		System.out.println(cart_id);
		for(Integer i:cart_id)
			System.out.println(i);
	User user = (User) request.getSession().getAttribute("user");
		int userid= user.getUserid();
		
		List<Receiver> receiverlist= receiverService.SelectReceiverByUserId(userid);
		request.setAttribute("receiverlist", receiverlist);
		
		return "home/order";
	}
	
}
