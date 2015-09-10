package com.booksales.dao;

import com.booksales.model.Classify;
import java.util.List;

public interface ClassifyDao {
    int deleteByPrimaryKey(Integer classifyid);

    int insert(Classify record);

    Classify selectByPrimaryKey(Integer classifyid);

    List<Classify> selectAll();

    int updateByPrimaryKey(Classify record);
}