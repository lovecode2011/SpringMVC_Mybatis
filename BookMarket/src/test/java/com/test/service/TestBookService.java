package com.test.service;

import javax.annotation.Resource;


import com.booksales.model.Book;
import com.booksales.service.BookServiceI;

public class TestBookService {
	
	private static BookServiceI bookService;
	
	public static BookServiceI getBookService() {
		return bookService;
	}
	@Resource(name="bookService")
	public static void setBookService(BookServiceI bookService) {
		TestBookService.bookService = bookService;
	}
	public static void addbook(){
		Book b = new Book();
		b.setAuthor("geon");
		b.setBookclassid(1);
		b.setBookname("什么鬼");
		b.setIntro("这是一个什么坑");
		b.setIsbn("35435");
		b.setPrice(44L);
		b.setPublish("hhseniogr");
		b.setPublishdate("2012-11-11");
		b.setRepertory("武汉");
		b.setSales(44);
		b.setStock(545345);
		bookService.addBook(b);
	}
	public static void main(String[] args) {
		addbook();
	}

}
