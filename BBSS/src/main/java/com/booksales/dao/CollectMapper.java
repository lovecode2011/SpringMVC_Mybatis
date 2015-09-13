package com.booksales.dao;

import com.booksales.model.Collect;
import java.util.List;

public interface CollectMapper {
    int deleteByPrimaryKey(Integer collectid);

    int insert(Collect record);

    Collect selectByPrimaryKey(Integer collectid);

    List<Collect> selectAll();

    int updateByPrimaryKey(Collect record);
}