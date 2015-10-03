package com.booksales.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.annotations.Param;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.booksales.model.Book;
import com.booksales.model.Cart;
import com.booksales.model.CartWapper;
import com.booksales.model.User;
import com.booksales.service.BookServiceI;
import com.booksales.service.CartServiceI;
import com.booksales.service.CartWapperServiceI;
import com.booksales.service.UserServiceI;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping()
public class UserController {
	private UserServiceI userService;
	@Autowired
	BookServiceI bookService;
	@Autowired
	CartWapperServiceI cartWapperService;
	private static Log logger = LogFactory.getLog(UserController.class);

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}
	/**
	 * 首页跳转
	 * @return
	 */
	@RequestMapping()
	public String showHome(HttpServletRequest request,Model model) {
		
		if(request.getSession().getAttribute("admin")!=null){
			return "forward:bookPage";
		}
		if(request.getSession().getAttribute("user")!=null){
			User u = (User) request.getSession().getAttribute("user");
			List<CartWapper> cartWapperlist =cartWapperService.selectCartListByUserId(u.getUserid());
			request.setAttribute("cartwapperlist", cartWapperlist);
			return "forward:/rank";
		}
		return "forward:/rank";
	}
	/**
	 * 跳转到登陆页面：管理员和用户都可以通过这个页面进入
	 * @param model
	 * @return
	 */   
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request,Model model) {
		logger.info("用户登录");
		//当session中有admin时，跳转到加载后台的数据处理方法中
		if(request.getSession().getAttribute("admin")!=null){
			return "forward:bookPage";
		}
		//当session中有user时，跳转到前台数据处理加载的方法中
		if(request.getSession().getAttribute("user")!=null){
			User u = (User) request.getSession().getAttribute("user");
			List<CartWapper> cartWapperlist =cartWapperService.selectCartListByUserId(u.getUserid());
			request.setAttribute("cartwapperlist", cartWapperlist);
			return "forward:/rank";
		}
		//当session中没有值时，跳转到登陆的页面进行登陆
		return "user/login";
	}
	/**
	 * 登陆页面请求POST
	 * @param request
	 * @param response
	 * @param httpSession
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login2(HttpServletRequest request,
			HttpServletResponse response,HttpSession httpSession) throws JsonGenerationException,
			JsonMappingException, IOException {
		// 获取emial
		String email = request.getParameter("email").trim();
		// 获取password
		String password = request.getParameter("password").trim();
		// 获取验证码code
		String verifycode = (String) request.getSession().getAttribute(
				"validateCode");
		// 获取输入的验证码
		String checkcode = request.getParameter("checkcode").trim().toUpperCase();
		// 是否记住密码
		String checkbox = request.getParameter("checkbox");
		User u = new User();
		// 判断验证码是否正确
		if (checkcode.equals(verifycode)) {
			
			logger.info("验证码正确==》" + checkcode);
			//判断用户输入的用户名和密码是否正确
			u = userService.login(email, password);
			ObjectMapper mapper = new ObjectMapper();
			logger.info("登陆用户为:"+mapper.writeValueAsString(u));
			
			if(u==null){
				return "user/login";
			}
			///记住密码功能实现：将email和password放在cookie中
			// 创建两个Cookie对象
			Cookie nameCookie = new Cookie("email", email);
			Cookie pwdCookie = new Cookie("password", password);
			// 如果点击了记住密码
			if (checkbox != null) {
				nameCookie.setMaxAge(60 * 60 * 24 * 3);
				pwdCookie.setMaxAge(60 * 60 * 24 * 3);
				response.addCookie(nameCookie);
				response.addCookie(pwdCookie);
			}
			// 否则清空cookie
			else {
				checkbox = "off";
				nameCookie.setMaxAge(1);
				pwdCookie.setMaxAge(1);
				response.addCookie(nameCookie);
				response.addCookie(pwdCookie);
			}
			//判断是否是管理员
			if("1".equals(u.getIsroot())){
				httpSession.setAttribute("admin", u);
				
				int bookAmount = bookService.selectBookAmount();
				request.setAttribute("bookAmount",bookAmount );
				return "forward:bookPage";
			}
			//否则就是普通用户
			else{
				httpSession.setAttribute("user", u);
				//将用户id放入cookie中，便于传送
				Cookie useridCookie = new Cookie("userid",String.valueOf(u.getUserid()));
				useridCookie.setMaxAge(60 * 60 * 24 * 3);
				response.addCookie(useridCookie);
				
				logger.info("购物车中User："+mapper.writeValueAsString(u));
				List<CartWapper> cartWapperlist =cartWapperService.selectCartListByUserId(u.getUserid());
				logger.info("购物车中的cart信息："+mapper.writeValueAsString(cartWapperlist));
				request.setAttribute("cartwapperlist", cartWapperlist);
				return "forward:/rank";
			}
		}
		//如果验证码没有通过
		request.setAttribute("error", "验证码输入错误");
		
		return "user/login";
	}
	
	/**
	 * 跳转到用户注册页面
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		logger.info("用户注册");
		return "user/register";
	}
	/**
	 * 用户注册:数据传入
	 * @param user
	 * @param model
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register2(User user,Model model) throws JsonGenerationException, JsonMappingException, IOException {
		
		logger.info("用户注册开始");
		int i =userService.register(user);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(user));
		logger.info("用户注册成功");
		if(i==1){
			model.addAttribute("register", i);
		}
		return "user/register";
	}
	
	/**
	 * 图书分页处理类
	 * @param pageNum
	 * @param pageSize
	 * @param request
	 * @param model
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/bookPage")
	public String bookPage(
			@RequestParam(value="pageNum",required=false,defaultValue="1")String pageNum,
			@RequestParam(value="pageSize",required=false,defaultValue="5")String pageSize,
			HttpServletRequest request,Model model) throws JsonGenerationException, JsonMappingException, IOException{
			
		ObjectMapper mapper = new ObjectMapper();
		int PNum = Integer.parseInt(pageNum);
		int PSize =Integer.parseInt(pageSize);
		PageHelper.startPage(PNum,PSize);
		PageInfo<Book> booklist = new PageInfo<Book>();
			 booklist = bookService.bookpage();
		logger.info(mapper.writeValueAsString(booklist));
		request.getSession().setAttribute("booklist", booklist);
		if(request.getSession().getAttribute("user")!=null){
			return "forward:showUser";
		}
		return "forward:showAdmin";
		
	}
	/**
	 * 显示管理员页面
	 * @param model
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/showAdmin")
	public String showAdmin(
			Model model) throws JsonGenerationException, JsonMappingException, IOException{
		List<User> userlist =userService.userList();
		model.addAttribute("userlist", userlist);
		return "user/showAdmin";
	}
	/**
	 * 显示用户页面
	 * @param model
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "{userid}/info")
	public String showUser(
			@PathVariable Integer userid,
			Model model) throws JsonGenerationException, JsonMappingException, IOException{
		
		List<User> userlist =userService.userList();
		model.addAttribute("userlist", userlist);
		return "user/showUser";
	}
	
	
	@RequestMapping(value = "/modifyBook/{userid}")
	public String modifyUser(@PathVariable Integer userid,Model model){
		User user = userService.getUserById(userid);
		model.addAttribute("user", user);
		return "user/modifyUser";
	}
	
	@RequestMapping(value = "/adminLogout")
	public String adminLogout(HttpServletRequest request){
		request.getSession().removeAttribute("admin");
		return "redirect:/";
		
	}
	@RequestMapping(value = "/userLogout")
	public String userLogout(HttpServletRequest request){
		//TODO
		//多用户登陆的时候，注销问题
		request.getSession().removeAttribute("user");
		return "redirect:/";
		
	}
	
	@RequestMapping(value = "/Validate/UserName",method = RequestMethod.POST)
	public void ValidateUserName(@RequestParam("username") String username,HttpServletResponse response) throws JsonGenerationException, JsonMappingException, IOException{
		
		User user=userService.ValidateUserName(username);
		ObjectMapper mapper = new ObjectMapper();
		
		logger.info("查看用户名是否已经注册："+mapper.writeValueAsString(user));
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		String result = new String();
		
		if(user!=null){
			result="<div class='alert alert-danger' role='alert' id='validateusername'>用户名存在！！！</div>";
		}else{
		//	result="<div class='alert alert-success' role='alert' id='validateusername'>用户名可用！</div>";
		}
		PrintWriter out = response.getWriter();
		out.println(result);
		out.close();				
	}
	
	@RequestMapping(value = "/Validate/Email",method = RequestMethod.POST)
	public void ValidateEmail(@RequestParam("email") String email,HttpServletResponse response) throws JsonGenerationException, JsonMappingException, IOException{
		
		User user=userService.ValidateEmail(email);
		ObjectMapper mapper = new ObjectMapper();
		
		logger.info("查看邮箱是否已经注册："+mapper.writeValueAsString(user));
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		String result = new String();
		
		if(user!=null){
			result="<div class='alert alert-danger' role='alert' id='validateemail'>邮箱已经存在！！！</div>";
		}else{
		//	result="<div class='alert alert-success' role='alert' id='validateusername'>用户名可用！</div>";
		}
		PrintWriter out = response.getWriter();
		out.println(result);
		out.close();				
	}
	
	
}
