package com.booksales.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		logger.info("GET-----查询所有根分类-----");
		List<Class> classMapperList = classService.SelectFatherId();
		model.addAttribute("classList", classMapperList);
		
		//json格式输出classMapperList
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(classMapperList));
		
		return "classify/addClassify";
	}
	
	@RequestMapping(value = "/addClassify", method = RequestMethod.POST)
	public String addClassify2(Model model,Class clazz) throws JsonGenerationException, JsonMappingException, IOException{
		
		classService.addClassify(clazz);
	//logger.info("POST-----查询所有根分类-----");
		//List<Class> classMapperList = classService.SelectFatherId();
		ObjectMapper mapper = new ObjectMapper();
	//	logger.info(mapper.writeValueAsString(classMapperList));
		logger.info(mapper.writeValueAsString(clazz));
	//model.addAttribute("classList", classMapperList);
		return "showUser";
	}
	
	
	
	
	
}
