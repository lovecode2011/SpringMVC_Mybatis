package com.booksales.service;

import java.util.List;

import com.booksales.model.Receiver;

public interface ReceiverServiceI {
	/**
	 * 添加收货地址
	 * @param receiver
	 * @return
	 */
	int addReceiver(Receiver receiver);
	/**
	 * 根据用户id查看用户所有收货地址
	 * @param userid
	 * @return
	 */
	List<Receiver> SelectReceiverByUserId(Integer userid);

}
