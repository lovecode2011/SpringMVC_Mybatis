package com.booksales.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.booksales.model.Book;
import com.booksales.model.Cart;
import com.booksales.model.User;
import com.booksales.service.BookServiceI;
import com.booksales.service.CartServiceI;
import com.booksales.service.UserServiceI;

@Controller
@RequestMapping()
public class CartController {
	@Autowired
	CartServiceI cartService;
	private static Log logger = LogFactory.getLog(CartController.class);
	@RequestMapping(value = "/addBook2Cart/{userid}/{bookid}", method = RequestMethod.GET)
	public  String addBook2Cart(@PathVariable Integer userid, @PathVariable Integer bookid,Model model){
		 int i =cartService.addCart(userid,bookid);
		 return "redirect:/";
	}
	@RequestMapping(value = "{userid}/listCart/", method = RequestMethod.GET)
	public String listCart(@PathVariable Integer userid,Model model){
		List<Cart> cartlist = cartService.listUserCart(userid);
		model.addAttribute("cartlist", cartlist);
		return "cart/listCart";
	}
}
