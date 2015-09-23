package com.booksales.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.dao.CartMapper;
import com.booksales.model.Book;
import com.booksales.model.Cart;
import com.booksales.model.User;
import com.booksales.service.BookServiceI;
import com.booksales.service.CartServiceI;
import com.booksales.service.UserServiceI;
@Service("cartService")
public class CartServiceImpl implements CartServiceI {
	@Autowired
	CartMapper cartMapper;
	@Autowired
	BookServiceI bookService;
	@Autowired
	UserServiceI userService;
	private static Log logger = LogFactory.getLog(CartServiceI.class);
	@Override
	public int addCart(Integer userid, Integer bookid) {
		Book book = bookService.selectBook(bookid);
		 User user= userService.getUserById(userid);
		 
		 Cart cart = new Cart();
		 cart.setBookid(bookid);
		 cart.setBookname(book.getBookname());
		 cart.setUserid(userid);
		 cart.setUsername(user.getUsername());
		 cart.setBooknum(1);
		 cart.setAmount(book.getPrice());
		 cartMapper.insert(cart);
		return 0;
	}
	@Override
	public List<Cart> listUserCart(Integer userid) {
		
		return cartMapper.selectUserCart(userid);
	}
}
