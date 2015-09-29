package com.booksales.service;

import java.util.List;

import com.booksales.model.Book;
import com.booksales.model.Cart;

public interface CartServiceI {

	/**
	 * 根据传入的userid 和bookid 将相关信息加入cart
	 * @param userid
	 * @param bookid
	 * @return
	 */
	int addCart(Integer userid, Integer bookid);
	/**
	 * 根据用户id查看该用户的购物车list
	 * @param userid
	 * @return
	 */
	List<Cart> listUserCart(Integer userid);
	/**
	 * 添加图书到购物车
	 * @param userid
	 * @param bookid
	 * @param username
	 * @param bookname
	 * @param bookNum
	 * @return
	 */
	int addCart(Integer userid, Integer bookid, String username,
			String bookname, Integer bookNum);

}
