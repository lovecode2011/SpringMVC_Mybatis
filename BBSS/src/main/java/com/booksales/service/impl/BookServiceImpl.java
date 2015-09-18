package com.booksales.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.dao.BookMapper;
import com.booksales.model.Book;
import com.booksales.service.BookServiceI;

@Service("bookService")
public class BookServiceImpl implements BookServiceI {
	@Autowired
	BookMapper bookMapper;
	private static Log logger = LogFactory.getLog(BookServiceImpl.class);

	public int addBook(Book book) {
		logger.info("Service  ----addBook");
		int i = bookMapper.insert(book);
		return i;

	}
	
	@Override
	public int delete(int i) {
		return bookMapper.deleteByPrimaryKey(i);
	}

	@Override
	public List<Book> bookList() {
		
		return bookMapper.selectAll();
	}

}
