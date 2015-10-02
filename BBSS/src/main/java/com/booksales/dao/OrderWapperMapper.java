package com.booksales.dao;

import java.util.List;

import com.booksales.model.OrderWapper;

public interface OrderWapperMapper {
	/**
	 * 根据用户id查询orderwapper
	 * @param userid
	 * @return
	 */
	List<OrderWapper> selectCartByUserid(Integer userid);

}
