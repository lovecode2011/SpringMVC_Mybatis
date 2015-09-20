package com.booksales.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.booksales.model.Book;
import com.github.pagehelper.PageInfo;

public interface BookServiceI {
	/**
	 * 添加图书
	 * @param book
	 * @return
	 */
	int addBook(Book book);
	/**
	 * 根据图书id删除图书
	 * @param i
	 * @return
	 */
	int delete(int i);
	/**
	 * 查询得到图书列表
	 * @return
	 */
	List<Book> bookList();
	
	/**
	 * 分页查询
	 * @param request 
	 * @return
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 */
	PageInfo<Book> bookpage() throws JsonGenerationException, JsonMappingException, IOException;
	/**
	 * 根据图书编号查询图书
	 * @param id
	 * @return Book对象
	 */
	Book selectBook(Integer id);
	/**
	 * 修改图书
	 * @param book
	 * @return
	 */
	int updateBook(Book book);
	
	

}
