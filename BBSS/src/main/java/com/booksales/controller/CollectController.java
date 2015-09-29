package com.booksales.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.booksales.model.Cart;
import com.booksales.model.Collect;
import com.booksales.service.CollectServiceI;

@Controller
@RequestMapping()
public class CollectController {
	@Autowired
	CollectServiceI collectService;
	
	@RequestMapping(value = "/collectBook/{userid}/{bookid}", method = RequestMethod.GET)
	public String collectBook(@PathVariable Integer userid, @PathVariable Integer bookid,Model model){
		int i =collectService.collectBook(userid,bookid);
		 return "redirect:/";
		
	}
	
	@RequestMapping(value = "{userid}/listCollect/", method = RequestMethod.GET)
	public String listCollect(@PathVariable Integer userid,Model model){
		List<Collect> collectlist = collectService.listCollect(userid);
		model.addAttribute("collectlist", collectlist);
		return "collect/listCollect";
	}
	@RequestMapping(value = "addCollect", method = RequestMethod.POST)
	public void addCollect(
			@RequestParam("userid") Integer userid,
			@RequestParam("bookid") Integer bookid,
			Model model,HttpServletResponse response){
		int i =collectService.collectBook(userid,bookid);
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		if(i>0){
			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e) {
				e.printStackTrace();
			}
			out.println("已经添加到收藏");
			out.close();	
		}
	}
	@RequestMapping(value = "romoveCollect", method = RequestMethod.POST)
	public void romoveCollect(
			@RequestParam("userid") Integer userid,
			@RequestParam("bookid") Integer bookid,
			Model model,HttpServletResponse response){
		int i =collectService.delcollectBook(userid,bookid);
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		if(i>0){
			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e) {
				e.printStackTrace();
			}
			out.println("已经删除该收藏");
			out.close();	
		}
	}
}
