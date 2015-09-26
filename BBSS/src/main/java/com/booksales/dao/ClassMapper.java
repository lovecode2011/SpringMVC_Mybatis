package com.booksales.dao;

import com.booksales.model.Cart;
import com.booksales.model.Class;

import java.util.List;

public interface ClassMapper {
	
    int deleteByPrimaryKey(Integer classid);
    /**
     * 添加图书分类
     * @param record
     * @return
     */
    int insert(Class record);

    Class selectByPrimaryKey(Integer classid);

    List<Class> selectAll();
    
    /**
     * 查询所有的父类
     * @return
     */
    List<Class> selectByFatherKey();
    

    int updateByPrimaryKey(Class record);
   
    /**
     * 根据父类id查询其子类的list 集合
     * @param id
     * @return List<Class>
     */
	List<Class> selectSubClassByFatherId(Integer classid);
	

	
}