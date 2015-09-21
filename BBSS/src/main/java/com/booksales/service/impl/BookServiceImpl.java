package com.booksales.service.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.booksales.dao.BookMapper;
import com.booksales.model.Book;
import com.booksales.service.BookServiceI;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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

	@Override
	public Book selectBook(Integer id) {
		return bookMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageInfo<Book> bookpage() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Book> booklist= bookMapper.selectAll();
	System.out.println("----------------------------");
		logger.info(mapper.writeValueAsString(booklist));
		PageInfo<Book> page = new PageInfo<Book>(booklist);
		System.out.println("----------------------------");
		logger.info(mapper.writeValueAsString(page));
		return page;
	}
	
	public PageInfo<Book> bookpage2(HttpServletRequest request) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		PageHelper.startPage(request);
		List<Book> booklist= bookMapper.selectAll();
	System.out.println("----------------------------");
		logger.info(mapper.writeValueAsString(booklist));
		PageInfo<Book> page = new PageInfo<Book>(booklist);
		System.out.println("----------------------------");
		logger.info(mapper.writeValueAsString(page));
		return page;
	}

	@Override
	@Transactional
	public int updateBook(Book book) {
		
	return bookMapper.updateByPrimaryKey(book);
	}

}
