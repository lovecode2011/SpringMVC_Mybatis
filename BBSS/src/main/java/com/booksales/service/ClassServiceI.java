package com.booksales.service;

import java.util.List;

import com.booksales.dao.ClassMapper;

public interface ClassServiceI {
	/**
	 * 查询所有分类的父类
	 * @return 父类的list
	 */
	List<ClassMapper> SelectFatherId();
}
