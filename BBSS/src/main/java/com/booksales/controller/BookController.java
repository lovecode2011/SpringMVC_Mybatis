package com.booksales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class BookController {
	@RequestMapping("/addBook")
	public String addBook(){
		return "book/addBook";
	}

}
