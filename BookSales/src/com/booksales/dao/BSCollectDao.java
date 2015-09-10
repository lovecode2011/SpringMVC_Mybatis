package com.booksales.dao;

import com.booksales.model.BSCollect;
import java.util.List;

public interface BSCollectDao {
    int deleteByPrimaryKey(Integer collectid);

    int insert(BSCollect record);

    BSCollect selectByPrimaryKey(Integer collectid);

    List<BSCollect> selectAll();

    int updateByPrimaryKey(BSCollect record);
}