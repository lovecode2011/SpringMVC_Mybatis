package com.booksales.dao;

import com.booksales.model.Cart;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer cartid);

    int insert(Cart record);

    Cart selectByPrimaryKey(Integer cartid);

    List<Cart> selectAll();

    int updateByPrimaryKey(Cart record);

	List<Cart> selectUserCart(Integer userid);

	
	Cart selectByBookId(Cart cart);
}