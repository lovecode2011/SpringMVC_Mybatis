package com.booksales.dao.mapper;

import com.booksales.model.Receiver;
import java.util.List;

public interface ReceiverMapper {
    int deleteByPrimaryKey(Integer receiverid);

    int insert(Receiver record);

    Receiver selectByPrimaryKey(Integer receiverid);

    List<Receiver> selectAll();

    int updateByPrimaryKey(Receiver record);
}