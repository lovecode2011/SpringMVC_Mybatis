package com.booksales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.dao.OrderWapperMapper;
import com.booksales.model.OrderWapper;
import com.booksales.service.OrderWapperServiceI;
@Service("orderWapperService")
public class OrderWapperServiceImpl implements OrderWapperServiceI {
	@Autowired
	private OrderWapperMapper orderWapperMapper;

	@Override
	public List<OrderWapper> selectCartByUserid(Integer userid) {
		return orderWapperMapper.selectCartByUserid(userid);
	}
}
