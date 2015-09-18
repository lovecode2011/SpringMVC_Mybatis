package com.booksales.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.dao.ReceiverMapper;
import com.booksales.model.Receiver;
import com.booksales.service.ReceiverServiceI;
@Service("receiverService")
public class ReceiverServiceImpl implements ReceiverServiceI {
	@Autowired
	ReceiverMapper receiverMapper;

	@Override
	public int addReceiver(Receiver receiver) {
		
		return receiverMapper.insert(receiver);
	}
}
