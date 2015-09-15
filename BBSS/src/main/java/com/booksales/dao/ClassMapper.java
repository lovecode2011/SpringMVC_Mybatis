package com.booksales.dao;

import com.booksales.model.Class;
import java.util.List;

public interface ClassMapper {
	
    int deleteByPrimaryKey(Integer classid);

    int insert(Class record);

    Class selectByPrimaryKey(Integer classid);

    List<Class> selectAll();
    
    /**
     * 查询所有的父类
     * @return
     */
    List<Class> selectByFatherKey();
    

    int updateByPrimaryKey(Class record);
}