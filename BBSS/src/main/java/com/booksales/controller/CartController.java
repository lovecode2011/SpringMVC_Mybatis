package com.booksales.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.booksales.model.Book;
import com.booksales.model.Cart;
import com.booksales.model.CartWapper;
import com.booksales.model.User;
import com.booksales.service.BookServiceI;
import com.booksales.service.CartServiceI;
import com.booksales.service.CartWapperServiceI;
import com.booksales.service.UserServiceI;

@Controller
@RequestMapping()
public class CartController {
	@Autowired
	CartServiceI cartService;
	@Autowired
	CartWapperServiceI cartWapperService;
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
	/**
	 * 图书详情页面    将图书加入购物车
	 * @param userid
	 * @param username
	 * @param bookid
	 * @param bookname
	 * @param bookNum
	 * @param model
	 * @param response
	 */
	@RequestMapping(value = "addCart", method = RequestMethod.POST)
	public void addCart(
			@RequestParam("userid") Integer userid,
			@RequestParam("username") String username,
			@RequestParam("bookid") Integer bookid,
			@RequestParam("bookname") String bookname,
			@RequestParam("bookNum") Integer bookNum
			,Model model,HttpServletResponse response){
		logger.info("---异步请求添加图书到购物车----");		
		int i =cartService.addCart(userid, bookid,username,bookname,bookNum);
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("已经添加到购物车");
		out.close();	
	}
	@RequestMapping(value = "{userid}/shoppingCart")
	public String shoppingCart(@PathVariable Integer userid ,Model model){
		
		List<CartWapper> cartwapperlist =	cartWapperService.selectCartListByUserId(userid);
		
		model.addAttribute("cartwapperlist", cartwapperlist);
		
		return "home/shoppingCart";
		
	}
	
}
