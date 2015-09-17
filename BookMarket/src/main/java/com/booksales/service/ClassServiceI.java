package com.booksales.service;

import java.util.List;

import com.booksales.model.Class;

public interface ClassServiceI {
	/**
	 * 查询所有分类的父类
	 * @return 父类的list
	 */
	List<Class> SelectFatherId();
	
	/**
	 * 添加分类
	 * @param clazz
	 * @return
	 */
	int addClassify(Class clazz);
	
	
	
	/**
	 * 根据父类id 查询子类分类
	 * @param fatherid
	 * @return 返回 子类的List
	 */
	List<Class> selectByFatherId(String fatherid);

	void delelte(int i);

}
