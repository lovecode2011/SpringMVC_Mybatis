package com.booksales.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.dao.ClassMapper;
import com.booksales.service.OrderServiceI;

@Service("orderService")
public class OrderServiceImpl implements OrderServiceI {
	private ClassMapper orderMapper;

	private static Log logger = LogFactory.getLog(OrderServiceImpl.class);

	@Autowired
	public void setOrderMapper(ClassMapper orderMapper) {
		this.orderMapper = orderMapper;
	}

}
