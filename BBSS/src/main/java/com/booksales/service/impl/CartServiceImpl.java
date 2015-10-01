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
		 cart.setUserid(userid);
		//查询数据库，查看该用户之前是否已经将该书加入购物车
		Cart cart1 =  cartMapper.selectByBookId(cart);
		int res = 0;
		if(cart1!=null){
			int booknum = cart1.getBooknum()+1;
			cart1.setBooknum(booknum);
			Double price = book.getPrice()*booknum;
			cart1.setAmount(price);
			res =cartMapper.updateByPrimaryKey(cart1);
			
		}else{
			
			 cart.setBookname(book.getBookname());
			
			 cart.setUsername(user.getUsername());
			 cart.setBooknum(1);
			 cart.setAmount(book.getPrice());
			 res= cartMapper.insert(cart);
		}
		
		return res;
	}
	@Override
	public List<Cart> listUserCart(Integer userid) {
		
		return cartMapper.selectUserCart(userid);
	}
	@Override
	public int addCart(Integer userid, Integer bookid, String username,String bookname, Integer bookNum) {
		Book book = bookService.selectBook(bookid);
		User user= userService.getUserById(userid);
		 Cart cart = new Cart();
		 cart.setBookid(bookid);
		 cart.setUserid(userid);
		//查询数据库，查看该用户之前是否已经将该书加入购物车
		Cart cart1 =  cartMapper.selectByBookId(cart);
		int res = 0;
		if(cart1!=null){
			int booknum = cart1.getBooknum()+bookNum;
			cart1.setBooknum(booknum);
			Double price = book.getPrice()*booknum;
			cart1.setAmount(price);
			res =cartMapper.updateByPrimaryKey(cart1);
			
		}else{
			
			 cart.setBookname(bookname);
			
			 cart.setUsername(username);
			 cart.setBooknum(bookNum);
			
			 cart.setAmount(book.getPrice()*bookNum);
			 res= cartMapper.insert(cart);
		}
		return res;
	}
	@Override
	public List<Cart> selectCartListByUserId(Integer userid) {
		return cartMapper.selectCartListByUserId(userid);
	}
	@Override
	public int delCartByCartId(Integer cartid) {
		return cartMapper.deleteByPrimaryKey(cartid);
	}
}
