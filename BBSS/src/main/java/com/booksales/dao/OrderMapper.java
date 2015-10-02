package com.booksales.dao;

import com.booksales.model.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderid);

    int insert(Order record);

    Order selectByPrimaryKey(Integer orderid);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
    /**
     * 根据用户id 查询该用户的订单
     * @param userid
     * @return
     */
	List<Order> selectByUserId(Integer userid);
    
}