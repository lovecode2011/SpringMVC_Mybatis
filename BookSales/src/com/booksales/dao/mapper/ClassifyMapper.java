package com.booksales.dao.mapper;

import com.booksales.model.Classify;
import java.util.List;

public interface ClassifyMapper {
    int deleteByPrimaryKey(Integer classifyid);

    int insert(Classify record);

    Classify selectByPrimaryKey(Integer classifyid);

    List<Classify> selectAll();

    int updateByPrimaryKey(Classify record);
}