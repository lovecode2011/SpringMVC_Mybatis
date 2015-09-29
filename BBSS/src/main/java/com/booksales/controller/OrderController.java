package com.booksales.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.booksales.model.Cart;
import com.booksales.model.CartWapper;
import com.booksales.model.Order;
import com.booksales.model.Receiver;
import com.booksales.model.User;
import com.booksales.service.CartWapperServiceI;
import com.booksales.service.OrderServiceI;
import com.booksales.service.ReceiverServiceI;

@Controller
@RequestMapping()
public class OrderController {
	@Autowired
	OrderServiceI orderService;
	@Autowired
	ReceiverServiceI receiverService;
	@Autowired
	CartWapperServiceI cartWapperService;
	private static Log logger = LogFactory.getLog(OrderController.class);
	
	@RequestMapping(value = "{userid}/addOrder")
	public String addOrder( @RequestParam Integer[] book_id, @RequestParam("userid") Integer useriid,HttpServletRequest request) throws JsonGenerationException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(useriid);
		System.out.println(book_id);
		List<CartWapper> cwlist= cartWapperService.selectCartForOrder(useriid,book_id);
		
		logger.info("选中的cart信息："+mapper.writeValueAsString(cwlist));
		
		//获取用户id---》获取收货地址
		User user = (User) request.getSession().getAttribute("user");
		int userid= user.getUserid();
		List<Receiver> receiverlist= receiverService.SelectReceiverByUserId(userid);
		request.setAttribute("receiverlist", receiverlist);
		request.setAttribute("cartwapperlist", cwlist);
		
		return "home/order";
	}
	@RequestMapping(value = "/{userid}/AddorderTo")
	public String addOrderTo( 
			@RequestParam("acartid") Integer[] acartid, 
			@RequestParam("auserid") Integer auserid,
			@RequestParam("areceiverid") Integer areceiverid,
			@RequestParam("apayway") String apayway,
			@RequestParam("aorderdate") Date aorderdate,
			@RequestParam("aorderAmount") Float aorderAmount,
			HttpServletRequest request,@PathVariable Integer userid) throws JsonGenerationException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		for(int i:acartid)
			System.out.println(i);
		 System.out.println(auserid);
		System.out.println(areceiverid);
		System.out.println(apayway);
		System.out.println(aorderdate);
		System.out.println(aorderAmount);
		//创建order对象，并把值都set进入
		Order order =new Order();
		order.setOrdertime(aorderdate);
		order.setSum(aorderAmount);
		order.setUserid(auserid);
		order.setReceiverid(areceiverid);
		order.setPayway(apayway);
		
		order.setLogisticsstates("0");
		order.setOrderstates("0");
		//将order加入数据库 ，//返回刚才加入的order的orderid，//将orderid加入到acartid数组中的cart中
		int i =orderService.CreatOrder(order,acartid);
		
		return "home/book";
	}
	
}
