package com.booksales.service;

import java.util.List;

import com.booksales.model.Cart;
import com.booksales.model.Order;

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
	 */
	int CreatOrder(Order order, Integer[] acartid);

}
