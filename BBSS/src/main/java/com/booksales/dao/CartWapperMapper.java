package com.booksales.dao;

import java.util.List;

import com.booksales.model.CartWapper;

public interface CartWapperMapper {

	List<CartWapper> selectListBookId(List<Integer> bookIdList);
	
}