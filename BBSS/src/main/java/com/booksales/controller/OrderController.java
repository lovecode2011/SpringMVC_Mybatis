package com.booksales.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.booksales.model.Cart;
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
	private static Log logger = LogFactory.getLog(OrderController.class);
	@RequestMapping(value = "{userid}/addOrder")
	public String addOrder( @RequestParam Integer[] book_id, @RequestParam("userid") Integer useriid,HttpServletRequest request) throws JsonGenerationException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(useriid);
		List<Cart> cartlst= orderService.selectCartForOrder(useriid,book_id);
		
		logger.info("选中的cart信息："+mapper.writeValueAsString(cartlst));
		
		//获取用户id---》获取收货地址
		User user = (User) request.getSession().getAttribute("user");
		int userid= user.getUserid();
		List<Receiver> receiverlist= receiverService.SelectReceiverByUserId(userid);
		request.setAttribute("receiverlist", receiverlist);
		
		return "home/order";
	}
	
}
