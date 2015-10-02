package com.booksales.service;

import java.util.List;

import com.booksales.model.OrderWapper;


public interface OrderWapperServiceI {
	/**
	 * 根据用户id查询orderwapper集合
	 * @param userid
	 * @return
	 */
	List<OrderWapper> selectCartByUserid(Integer userid);

}
