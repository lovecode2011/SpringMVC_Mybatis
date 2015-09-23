package com.booksales.service;

import java.util.List;

import com.booksales.model.Collect;

public interface CollectServiceI {

	int collectBook(Integer userid, Integer bookid);

	List<Collect> listCollect(Integer userid);

}
