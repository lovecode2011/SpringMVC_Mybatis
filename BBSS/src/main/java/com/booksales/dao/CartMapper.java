package com.booksales.dao;

import com.booksales.model.Cart;
import com.booksales.model.CartWapper;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer cartid);

    int insert(Cart record);

    Cart selectByPrimaryKey(Integer cartid);

    List<Cart> selectAll();

    int updateByPrimaryKey(Cart record);

	List<Cart> selectUserCart(Integer userid);

	
	Cart selectByBookId(Cart cart);
	
	
	/**
     * 根据bookid集合查询cart集合
     * @param cartIdList
     * @return
     */
	List<Cart> selectListBookId(List<Integer> bookIdList);
	/**
	 * 更新cart的cartid
	 * @param c
	 * @return 
	 */
	int updateCartOrderId(Cart c);
	/**
	 * 根据cartid集合查询cart集合
	 * @param cartIdList
	 * @return
	 */
	List<Cart> selectListCartId(List<Integer> cartIdList);
	/**
	 * 根据用户id查询该用户的购物车
	 * @param userid
	 * @return
	 */
	List<Cart> selectCartListByUserId(Integer userid);
}