package com.booksales.service;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.booksales.model.Cart;
import com.booksales.model.Order;
import com.booksales.model.OrderWapper;

public interface OrderServiceI {
	/**
	 * 根据传入的图书的bookid集合 ，查询所有cart，并放回cart的集合
	 * @param cart_id
	 * @return
	 */
	List<Cart> selectCartForOrder(Integer[] book_id);
	
	/**
	 * 根据传入的图书的bookid集合和 用户id ，查询该用户的所有cart，并放回cart的集合
	 * @param cart_id
	 * @return
	 */
	
	List<Cart> selectCartForOrder(Integer useriid, Integer[] book_id);
	/**
	 * 创建一个新的order，返回该order的orderid ，并将orderid赋值给acartid中的cart集合中
	 * @param order
	 * @param acartid 
	 * @return
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 */
	int CreatOrder(Order order, Integer[] acartid) throws JsonGenerationException, JsonMappingException, IOException;
	/**
	 * 根据用户id查询改用户所有的订单  
	 * @param userid
	 * @return
	 */
	List<Order> selectCartByUserid(Integer userid);
	/**
	 * 根据orderid删除订单
	 * @param orderid
	 * @return
	 */
	int delOrderByOrderId(Integer orderid);

}
