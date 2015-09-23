package com.booksales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value = "/listCollect/{userid}", method = RequestMethod.GET)
	public String listCollect(@PathVariable Integer userid,Model model){
		List<Collect> collectlist = collectService.listCollect(userid);
		model.addAttribute("collectlist", collectlist);
		return "collect/listCollect";
		
	}
}
