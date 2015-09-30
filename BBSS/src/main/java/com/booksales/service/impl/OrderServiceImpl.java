package com.booksales.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.dao.CartMapper;
import com.booksales.dao.OrderMapper;
import com.booksales.model.Cart;
import com.booksales.model.Order;
import com.booksales.service.OrderServiceI;

@Service("orderService")
public class OrderServiceImpl implements OrderServiceI {
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private CartMapper cartMapper;

	private static Log logger = LogFactory.getLog(OrderServiceImpl.class);

	
	public List<Cart> selectCartForOrder(Integer[] cart_id) {
		List<Integer> cartIdList =Arrays.asList(cart_id);
		System.out.println(cartIdList);
		
		return cartMapper.selectListBookId(cartIdList);
	}

	@Override
	public List<Cart> selectCartForOrder(Integer useriid, Integer[] book_id) {
		List<Integer> bookIdList =Arrays.asList(book_id);
		
		List<Cart> resultList =new ArrayList<Cart>();
		
		List<Cart> cartList=cartMapper.selectListBookId(bookIdList);
		for(Cart c:cartList){
			if(c.getUserid()==useriid){
				resultList.add(c);
			}
		}
		return resultList;
	}

	@Override
	public int CreatOrder(Order order, Integer[] acartid) throws JsonGenerationException, JsonMappingException, IOException {
		
		
		int i = orderMapper.insert(order);
		
		int orderid =order.getOrderid();
		System.out.println("添加到数据库的order的orderid为："+order.getOrderid());
		
		//将Integer[]转换为list<Integer>
		List<Integer> cartIdList =Arrays.asList(acartid);
		//先获取全部LIST<Integer>中的cart
		List<Cart> cartList=cartMapper.selectListCartId(cartIdList);
		ObjectMapper mapper = new ObjectMapper();
		
		
		logger.info("选中的cart信息："+mapper.writeValueAsString(cartList));
		List<Cart> updateList =new ArrayList<Cart>();
		
		int result= 0;
		for(Cart c:cartList){
			c.setOrderid(orderid);
			
			updateList.add(c);
			int m= cartMapper.updateCartOrderId(c);
			
			result+=m;
		}
		return result;
	}


}
