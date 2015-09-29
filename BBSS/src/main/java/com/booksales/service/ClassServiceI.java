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
	
	/**
	 * 遍历第一层目录，第一层由管理员在数据库手工添加
	 * @return 第一层目录的book对象的集合
	 */
	List<Class> selectClassOne();
	/**
	 * 根据传入的第一层id,遍历第二层目录并返会
	 * @param id	第一层目录的id
	 * @return  第二层目录下的book对象的集合
	 */
	List<Class> selectClassTwo(Integer id);
	/**
	 * 根据传入的第二层id,遍历第三层目录并返会
	 * @param id	第二层目录的id
	 * @return  第三层目录下的book对象的集合
	 */
	List<Class> selectClassThree(Integer id);
    /**
     * 添加一级目录，，一级目录的fatherid默认为0
     * @return
     */
	int addClassifyOne(Class clazz);

	List<Class> selectAll();
	/**
	 * 根据id查询父类id
	 * @param classify
	 * @return
	 */
	Class SelectTwoClassify(int classify);

}
