package com.booksales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.dao.CollectMapper;
import com.booksales.model.Book;
import com.booksales.model.Collect;
import com.booksales.model.User;
import com.booksales.service.BookServiceI;
import com.booksales.service.CollectServiceI;
import com.booksales.service.UserServiceI;

@Service("collectService")
public class CollectServiceImpl implements CollectServiceI  {
	@Autowired
	CollectMapper collectMapper;
	
	@Override
	public int collectBook(Integer userid, Integer bookid) {
		
		 Collect collect = new Collect();
		 collect.setBookid(bookid);
		 collect.setUserid(userid);
		int i= collectMapper.insert(collect);
		 
		return i;
	}
	@Override
	public List<Collect> listCollect(Integer userid) {
		
		return collectMapper.selectByUserId(userid);
	}

}
