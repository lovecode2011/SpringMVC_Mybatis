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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

	/**
	 * 查看所有根分类
	 * @param model
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
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
	/**
	 * 传入 Class，添加到二级分类
	 * @param model
	 * @param clazz
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/addClassify", method = RequestMethod.POST)
	public String addClassify2(Model model,Class clazz) throws JsonGenerationException, JsonMappingException, IOException{
		logger.info("POST----添加二级分类-----");
		classService.addClassify(clazz);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(clazz));
		
		logger.info("POST----添加二级分类成功-----");
		return "showUser";
	}
	
	/**
	 * 添加第三级目录时的第一步：查询第一级目录，第二步：查询父类目录下子目录
	 * 				
	 * @param model
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/addSubClassify", method = RequestMethod.GET)
	public String addSubClassify(Model model) throws JsonGenerationException, JsonMappingException, IOException{
		
		logger.info("GET-----查询所有根分类=》添加三级目录-----");
		List<Class> classMapperList = classService.SelectFatherId();
		model.addAttribute("classList", classMapperList);
		
		//json格式输出classMapperList
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(classMapperList));
		
		return "classify/addSubClassify";
	}
	/**
	 * 传入Class， 添加到第三层目录
	 * @param model
	 * @param clazz
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/addSubClassify", method = RequestMethod.POST)
	public String addSubClassify2(HttpServletRequest request,
			HttpServletResponse respons) throws JsonGenerationException, JsonMappingException, IOException{
		logger.info("POST----添加三级分类-----");
		logger.info("firstid===》"+request.getParameter("classfatherid"));
		logger.info("secondid===》"+request.getParameter("classSubid"));
		logger.info("classname===》"+request.getParameter("classname"));
		
		Integer firstid = Integer.parseInt(request.getParameter("classfatherid"));
		Integer secondid = Integer.parseInt(request.getParameter("classSubid"));
		String classname = request.getParameter("classname");
		
		
		
		
		Class clazz =new Class();
		//如果第二级菜单不为空。则将不进行
		if(secondid!=null){
			clazz.setClassfatherid(secondid);
			clazz.setClassname(classname);
			classService.addClassify(clazz);
		}
		
		
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(clazz));
		
		logger.info("POST----添加三级分类成功-----");
		return "showUser";
	}
	
	/**
	 * 根据传入的父类分类的id，查询该父类的所有的子分类。
	 * @param request
	 * @param respons
	 * @return   返回子分类的List的json
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectByFatherId", method = RequestMethod.POST)
	@ResponseBody 
	public List<Class> selectByFatherId(HttpServletRequest request,
			HttpServletResponse respons) throws JsonGenerationException, JsonMappingException, IOException{
		logger.info("POST-----根据父类id查询子类开始-----");
		String fatherid = request.getParameter("fatherid");
		logger.info("传入的id为："+fatherid);
		List<Class> clist=	classService.selectByFatherId(fatherid);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(clist));
		return clist;
	}
	/**
	 * 查找第一层目录，返回第一层目录的json对象
	 * @param model
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectClassOne", method = RequestMethod.GET)
	@ResponseBody 
	public List<Class> selectClassOne(Model model) throws JsonGenerationException, JsonMappingException, IOException{
		logger.info("GET-----查询第一层分类-----");
		List<Class> classOnelist=	classService.selectClassOne();
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(classOnelist));
		return classOnelist;
	}
	/**
	 * 查找第一层目录，返回第一层目录的json对象
	 * @param model
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectClassTwo/{id}", method = RequestMethod.GET)
	@ResponseBody 
	public List<Class> selectClassTwo(Model model,@PathVariable Integer id) throws JsonGenerationException, JsonMappingException, IOException{
		logger.info("GET-----查询第二层分类-----");
		List<Class> classTwolist=	classService.selectClassTwo(id);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(classTwolist));
		return classTwolist;
	}
	@RequestMapping(value = "/selectClassThree/{id}", method = RequestMethod.GET)
	@ResponseBody 
	public List<Class> selectClassThree(Model model,@PathVariable Integer id) throws JsonGenerationException, JsonMappingException, IOException{
		logger.info("GET-----查询第三层分类-----");
		List<Class> classThreelist=	classService.selectClassThree(id);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(classThreelist));
		return classThreelist;
	}
}
