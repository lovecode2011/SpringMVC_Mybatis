package com.booksales.controller;

import java.io.IOException;
import java.util.ArrayList;
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

import com.booksales.common.model.ClassifyJson;
import com.booksales.common.model.Node;
import com.booksales.common.model.Node2;
import com.booksales.common.model.S;
import com.booksales.common.model.TreeJson;
import com.booksales.common.model.ZTreejson;
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
	
	@RequestMapping(value = "/addClassifyOne", method = RequestMethod.GET)
	public String addClassifyOne(Model model) throws JsonGenerationException,
			JsonMappingException, IOException {
		logger.info("GET-----添加一级分类-----");
		return "classify/addClassifyOne";
	}
	@RequestMapping(value = "/addClassifyOne", method = RequestMethod.POST)
	public String addClassifyOne2(Model model, Class clazz)
			throws JsonGenerationException, JsonMappingException, IOException {
		logger.info("POST----添加一级分类-----");
		int i = classService.addClassifyOne(clazz);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(clazz));
		if (i == 1) {
			logger.info("POST----添加一级分类成功-----");
		}
		return "user/showAdmin";
	}

	/**
	 * 添加二级目录
	 * 
	 * @param model
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/addClassifyTwo", method = RequestMethod.GET)
	public String addClassifyTwo(Model model) throws JsonGenerationException,
			JsonMappingException, IOException {

		logger.info("GET-----添加二级目录-----");
		List<Class> classMapperList = classService.selectClassOne();
		model.addAttribute("classList", classMapperList);

		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(classMapperList));

		return "classify/addClassifyTwo";
	}

	/**
	 * 传入 Class，添加到二级分类
	 * 
	 * @param model
	 * @param clazz
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/addClassifyTwo", method = RequestMethod.POST)
	public String addClassifyTwo2(Model model, Class clazz)
			throws JsonGenerationException, JsonMappingException, IOException {
		logger.info("POST----添加二级分类-----");
		classService.addClassify(clazz);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(clazz));

		logger.info("POST----添加二级分类成功-----");
		return "user/showAdmin";
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
	@RequestMapping(value = "/addClassifyThree", method = RequestMethod.GET)
	public String addClassifyThree(Model model) throws JsonGenerationException,
			JsonMappingException, IOException {

		logger.info("GET-----查询所有根分类=》添加三级目录-----");
		List<Class> classMapperList = classService.selectClassOne();
		model.addAttribute("classList", classMapperList);

		// json格式输出classMapperList
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(classMapperList));

		return "classify/addClassifyThree";
	}

	/**
	 * 传入Class， 添加到第三层目录
	 * 
	 * @param model
	 * @param clazz
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/addClassifyThree", method = RequestMethod.POST)
	public String addClassifyThree2(HttpServletRequest request,
			HttpServletResponse respons) throws JsonGenerationException,
			JsonMappingException, IOException {
		logger.info("POST----添加三级分类-----");
		logger.info("firstid===》" + request.getParameter("classfatherid"));
		logger.info("secondid===》" + request.getParameter("classSubid"));
		logger.info("classname===》" + request.getParameter("classname"));

		Integer firstid = Integer.parseInt(request
				.getParameter("classfatherid"));
		Integer secondid = Integer.parseInt(request.getParameter("classSubid"));
		String classname = request.getParameter("classname");

		Class clazz = new Class();
		// 如果第二级菜单不为空。则将不进行
		if (secondid != null) {
			clazz.setClassfatherid(secondid);
			clazz.setClassname(classname);
			classService.addClassify(clazz);
		}

		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(clazz));

		logger.info("POST----添加三级分类成功-----");
		return "user/showAdmin";
	}

	/**
	 * 根据传入的父类分类的id，查询该父类的所有的子分类。
	 * 
	 * @param request
	 * @param respons
	 * @return 返回子分类的List的json
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectByFatherId", method = RequestMethod.POST)
	@ResponseBody
	public List<Class> selectByFatherId(HttpServletRequest request,
			HttpServletResponse respons) throws JsonGenerationException,
			JsonMappingException, IOException {
		logger.info("POST-----根据父类id查询子类开始-----");
		String fatherid = request.getParameter("fatherid");
		logger.info("传入的id为：" + fatherid);
		List<Class> clist = classService.selectByFatherId(fatherid);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(clist));
		return clist;
	}

	/**
	 * 查找第一层目录，返回第一层目录的json对象
	 * 
	 * @param model
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectClassOne", method = RequestMethod.GET)
	@ResponseBody
	public List<Class> selectClassOne(Model model)
			throws JsonGenerationException, JsonMappingException, IOException {
		logger.info("GET-----查询第一层分类-----");
		List<Class> classOnelist = classService.selectClassOne();
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(classOnelist));
		return classOnelist;
	}

	/**
	 * 查找第一层目录，返回第一层目录的json对象
	 * 
	 * @param model
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectClassTwo/{id}", method = RequestMethod.GET)
	@ResponseBody
	public List<Class> selectClassTwo(Model model, @PathVariable Integer id)
			throws JsonGenerationException, JsonMappingException, IOException {
		logger.info("GET-----查询第二层分类-----");
		List<Class> classTwolist = classService.selectClassTwo(id);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(classTwolist));
		return classTwolist;
	}

	@RequestMapping(value = "/selectClassThree/{id}", method = RequestMethod.GET)
	@ResponseBody
	public List<Class> selectClassThree(Model model, @PathVariable Integer id)
			throws JsonGenerationException, JsonMappingException, IOException {
		logger.info("GET-----查询第三层分类-----");
		List<Class> classThreelist = classService.selectClassThree(id);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(classThreelist));
		return classThreelist;
	}
	@RequestMapping(value = "/classifyTreeJson")
	@ResponseBody
	public List<TreeJson> classifyTreeJson() throws JsonGenerationException,
			JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		// 第一层目录
		List<Class> c1list = classService.selectClassOne();
		
		List<TreeJson> cj1list = new ArrayList<TreeJson>(c1list.size());
		for (Class c : c1list) {
			TreeJson cj = new TreeJson();
			// cj获取名字
			cj.setText(c.getClassname());
			// 第二层目录
			List<Class> c2list = classService.selectClassTwo(c.getClassid());

//			logger.info("第二层" + mapper.writeValueAsString(c2list));
			// 要生成的第二层对象
			List<Node> n1 = new ArrayList<Node>(c2list.size());
			// 第二层json对象

			// 用s遍历c2list,并将s加入到cj
	//		logger.info("==================================================");
			for (Class cc : c2list) {
				Node n = new Node();
				n.setText(cc.getClassname());
				// 第三层
				List<Class> c3list = classService.selectClassThree(cc
						.getClassid());

	//			logger.info("第三层" + mapper.writeValueAsString(c3list));
				// 要生成的第三层对象
				List<Node2> n2 = new ArrayList<Node2>(c3list.size());
				// 第三层json对象

	//			logger.info("==================================================");
				for (Class ccc : c3list) {
					Node2 nn = new Node2();
					nn.setText(ccc.getClassname());
					n2.add(nn);
				}
				n.setNodes(n2);
				n1.add(n);
			}
			cj.setNodes(n1);
			cj1list.add(cj);
		}
		logger.info("json" + mapper.writeValueAsString(cj1list));
		return cj1list;

		
		
	}
	@RequestMapping(value = "/classifyZTreeJson")
	@ResponseBody
	public List<ZTreejson> classifyZTreeJson() throws JsonGenerationException,
			JsonMappingException, IOException {
		List <Class> cl= classService.selectAll();
		List<ZTreejson> ztl = new ArrayList<ZTreejson>(cl.size());
		
		
		for(Class c :cl){
			ZTreejson zt = new ZTreejson();
			zt.setId(c.getClassid());
			zt.setName(c.getClassname());
			zt.setpId(c.getClassfatherid());
			ztl.add(zt);
		}
		ObjectMapper mapper = new ObjectMapper();
		logger.info("ZTReejson" + mapper.writeValueAsString(ztl));
		return ztl;
		
	}
	
	
	@RequestMapping(value = "/classifyJson")
	@ResponseBody
	public List<ClassifyJson> classifyJson() throws JsonGenerationException,
			JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		// 第一层目录
		List<Class> c1list = classService.selectClassOne();

	//	logger.info("第一层" + mapper.writeValueAsString(c1list));
		// 要生成的第一层对象
		List<ClassifyJson> cj1list = new ArrayList<ClassifyJson>(c1list.size());
		// 第一层json对象

		// 用cj遍历c1list，并把cj放入cj1list
	//	logger.info("==================================================");
		for (Class c : c1list) {
			ClassifyJson cj = new ClassifyJson();
			// cj获取名字
			cj.setN(c.getClassname());
			// 第二层目录
			List<Class> c2list = classService.selectClassTwo(c.getClassid());

//			logger.info("第二层" + mapper.writeValueAsString(c2list));
			// 要生成的第二层对象
			List<S> s1 = new ArrayList<S>(c2list.size());
			// 第二层json对象

			// 用s遍历c2list,并将s加入到cj
	//		logger.info("==================================================");
			for (Class cc : c2list) {
				S s = new S();
				s.setN(cc.getClassname());
				// 第三层
				List<Class> c3list = classService.selectClassThree(cc
						.getClassid());

	//			logger.info("第三层" + mapper.writeValueAsString(c3list));
				// 要生成的第三层对象
				List<S> s2 = new ArrayList<S>(c3list.size());
				// 第三层json对象

	//			logger.info("==================================================");
				for (Class ccc : c3list) {
					S ss = new S();
					ss.setN(ccc.getClassname());
					s2.add(ss);
				}
				s.setS(s2);
				s1.add(s);
			}
			cj.setS(s1);
			cj1list.add(cj);
		}
		logger.info("json" + mapper.writeValueAsString(cj1list));
		return cj1list;

	}
	
	@RequestMapping(value = "/TestTree",produces="application/json;charset=UTF-8")
	public String TestTree(){
		return "classify/ZTreeTest2";
		
	}

}
