package com.booksales.controller;

import java.io.IOException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.booksales.model.Class;
import com.booksales.service.ClassServiceI;


@Controller
@RequestMapping()
public class ClassifyController {
	
	private ClassServiceI classService;
	
	private static Log logger = LogFactory.getLog(ClassifyController.class);
	
	@Autowired
	public void setClassService(ClassServiceI classService) {
		this.classService = classService;
	}


	@RequestMapping(value = "/addClassify", method = RequestMethod.GET)
	public String addClassify(Model model) throws JsonGenerationException, JsonMappingException, IOException{
		
		logger.info("-----查询所有根分类-----");
		List<Class> classMapperList = classService.SelectFatherId();
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(classMapperList));
		model.addAttribute("classList", classMapperList);
		return "classify/addClassify";
	}
	
	
	
	
	
}
