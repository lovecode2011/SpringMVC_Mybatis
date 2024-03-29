package com.booksales.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.booksales.model.CartWapper;
import com.booksales.model.Order;
import com.booksales.model.OrderWapper;
import com.booksales.model.Receiver;
import com.booksales.model.User;
import com.booksales.service.CartWapperServiceI;
import com.booksales.service.OrderServiceI;
import com.booksales.service.OrderWapperServiceI;
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
	@Autowired
	OrderWapperServiceI orderWapperService;
	
	private static Log logger = LogFactory.getLog(OrderController.class);
	
	@RequestMapping(value = "{userid}/personOrder")
	public String personOrder(@PathVariable("userid") Integer userid,HttpServletRequest request) throws JsonGenerationException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		
		List<OrderWapper> orderwapperlist=orderWapperService.selectCartByUserid(userid);
		
		logger.info("该用户的订单集合为："+mapper.writeValueAsString(orderwapperlist));
		
		request.setAttribute("orderwapperlist", orderwapperlist);
		return "home/order_person";
	}
	
	
	
	
	@RequestMapping(value = "{userid}/addOrder")
	public String addOrder( @RequestParam Integer[] book_id, @RequestParam("userid") Integer userid,HttpServletRequest request) throws JsonGenerationException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(userid);
		System.out.println(book_id);
		List<CartWapper> cwlist= cartWapperService.selectCartForOrder(userid,book_id);
		
		logger.info("选中的cart信息："+mapper.writeValueAsString(cwlist));
		
		//获取用户id---》获取收货地址
		User user = (User) request.getSession().getAttribute("user");
		int ruserid= user.getUserid();
		List<Receiver> receiverlist= receiverService.SelectReceiverByUserId(ruserid);
		request.setAttribute("receiverlist", receiverlist);
		request.setAttribute("cartwapperlist", cwlist);
		
		return "home/order";
	}
	@RequestMapping(value = "{userid}/addorderToOrder")
	public String addOrderToOrder( @RequestParam Integer[] Cart_Id, @PathVariable("userid") Integer userid,HttpServletRequest request) throws JsonGenerationException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(userid);
		System.out.println(Cart_Id);
		List<CartWapper> cwlist= cartWapperService.selectCartByCartId(userid,Cart_Id);
		
		logger.info("选中的cart信息："+mapper.writeValueAsString(cwlist));
		
//		//获取用户id---》获取收货地址
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
		//创建order对象，并把值都set进入
		Order order =new Order();
		order.setOrdertime(aorderdate);
		order.setSum(aorderAmount);
		order.setUserid(auserid);
		order.setReceiverid(areceiverid);
		order.setPayway(apayway);
		
		order.setLogisticsstates("0");
		order.setOrderstates("0");
		int cartidSize = acartid.length;
		//将order加入数据库 ，//返回刚才加入的order的orderid，//将orderid加入到acartid数组中的cart中
		int i =orderService.CreatOrder(order,acartid);
		if(cartidSize == i){
			return "home/userinfo";
		}
		return "home/book";
	}
	@RequestMapping(value = "removeOrder")
	public void removeOrder(@RequestParam Integer orderid,HttpServletResponse response){
		
		int i =orderService.delOrderByOrderId(orderid);
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		if(i>0){
			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e) {
				e.printStackTrace();
			}
			out.println("已经删除该订单");
			out.close();	
		}
		
	}
}
