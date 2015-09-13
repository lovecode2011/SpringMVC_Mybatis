package com.booksales.dao;

import com.booksales.model.Class;
import java.util.List;

public interface ClassMapper {
    int deleteByPrimaryKey(Integer classid);

    int insert(Class record);

    Class selectByPrimaryKey(Integer classid);

    List<Class> selectAll();

    int updateByPrimaryKey(Class record);
}