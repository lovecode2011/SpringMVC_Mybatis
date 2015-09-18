package com.booksales.service;

import java.util.List;

import com.booksales.model.Book;

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

}
