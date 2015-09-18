package com.booksales.service;

import com.booksales.model.Receiver;

public interface ReceiverServiceI {
	/**
	 * 添加收货地址
	 * @param receiver
	 * @return
	 */
	int addReceiver(Receiver receiver);

}
