package com.booksales.dao;

import java.util.List;

import com.booksales.model.CartWapper;

public interface CartWapperMapper {

	List<CartWapper> selectListBookId(List<Integer> bookIdList);
	/**
	 * 根据用户id查询用户的购物车
	 * @param userid
	 * @return
	 */
	List<CartWapper> selectCartListByUserId(Integer userid);
	
}