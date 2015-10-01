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
		 
		Collect c= collectMapper.selectCollectUserIdBookId(collect);
		int i=0;
		if(c!=null){
			i=1;
		}
		else{
			i= collectMapper.insert(collect);
		}
		return i;
	}
	@Override
	public List<Collect> listCollect(Integer userid) {
		
		return collectMapper.selectByUserId(userid);
	}
	@Override
	public boolean selectCollect(Integer bookid, String userid) {
		
		int uid = Integer.parseInt(userid);
		List<Collect> collectlist =collectMapper.selectByUserId(uid);
		for(Collect c :collectlist){
			if(c.getBookid()==bookid){
				return true;
			}
		}
		return false;
	}
	@Override
	public int delcollectBook(Integer userid, Integer bookid) {
		Collect c = new Collect();
		c.setBookid(bookid);
		c.setUserid(userid);
		return collectMapper.deleteCollect(c);	}

}
