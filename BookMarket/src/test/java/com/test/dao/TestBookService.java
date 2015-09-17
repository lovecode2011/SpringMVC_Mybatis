package com.test.dao;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.booksales.dao.UserMapper;
import com.booksales.model.Book;
import com.booksales.model.User;
import com.booksales.service.BookServiceI;
import com.booksales.service.ClassServiceI;
import com.booksales.service.UserServiceI;
import com.booksales.service.impl.BookServiceImpl;
import com.booksales.service.impl.ClassServiceImpl;
import com.booksales.service.impl.UserServiceImpl;

public class TestBookService {
	private static Log logger = LogFactory.getLog(TestBookService.class);
	public static void main(String[] args) {
		Book book = new Book();
		book.setAuthor("hw");
		book.setBookname("bookname");
		book.setPublish("bookname");
		book.setIsbn("35435");
		book.setBookclassid(34);
		book.setPrice(33L);
		book.setStock(43);
		book.setPublishdate("2011-11-11");
		
		BookServiceI bookService = new BookServiceImpl();
		ClassServiceI clazz = new ClassServiceImpl();
//		logger.debug(book);
//		logger.debug(bookService);
//		logger.debug(bookService.addBook(book));
		
		
	//	bookService.delete(1);
//		clazz.delelte(11);
		UserServiceI userService = new UserServiceImpl();
        User user =new User();
        user.setEmail("345341@qq.com");
        user.setPassword("34534");
        user.setUsername("grgr");
        userService.register(user);
		
}
}
