package com.booksales.dao;

import com.booksales.model.Receiver;

import java.util.List;

public interface ReceiverMapper {
    int deleteByPrimaryKey(Integer receiverid);

    int insert(Receiver record);

    Receiver selectByPrimaryKey(Integer receiverid);

    List<Receiver> selectAll();

    int updateByPrimaryKey(Receiver record);
    /**
     * 根据用户id查用户所有的收货表
     * @param userid
     * @return
     */
	List<Receiver> selectUserReceiver(Integer userid);
}