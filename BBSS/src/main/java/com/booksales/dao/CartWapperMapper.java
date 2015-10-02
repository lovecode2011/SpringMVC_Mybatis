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
	/**
	 * 根据cart集合查询cartwapper的集合
	 * @param cartidlist
	 * @return
	 */
	List<CartWapper> selectCartListByCartid(List<Integer> cartidlist);
	
}