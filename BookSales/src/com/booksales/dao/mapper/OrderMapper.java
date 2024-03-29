package com.booksales.dao.mapper;

import com.booksales.model.Order;
import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderid);

    int insert(Order record);

    Order selectByPrimaryKey(Integer orderid);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}