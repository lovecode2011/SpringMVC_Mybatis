package com.booksales.controller;

import java.beans.PropertyEditorSupport;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.booksales.model.Book;
import com.booksales.service.BookServiceI;
import com.sun.media.jfxmedia.logging.Logger;

@Controller
@RequestMapping()
public class BookController {
	@Autowired
	BookServiceI bookService;

	private static Log logger = LogFactory.getLog(BookController.class);

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new DateEditor());
	}

	public class DateEditor extends PropertyEditorSupport {
		@Override
		public void setAsText(String text) throws IllegalArgumentException {
			SimpleDateFormat format = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			Date date = null;
			try {
				date = format.parse(text);
			} catch (ParseException e) {
				format = new SimpleDateFormat("yyyy-MM-dd");
				try {
					date = format.parse(text);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
			}
			setValue(date);
		}
	}

	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
	public String addBook(Model model) {
		logger.info("GET----添加图书----");
		return "book/addBook";
	}

	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public String addBook2(
			@RequestParam("bookname") String bookname,
			@RequestParam("author") String author,
			@RequestParam("publish") String publish,
			@RequestParam("isbn") String isbn,
			@RequestParam("publishdate") String publishdate,
			@RequestParam("repertory") String repertory,
			@RequestParam("price") Double price,
			@RequestParam("stock") Integer stock,
			@RequestParam("bookOneclassid") Integer bookOneclassid,
			@RequestParam(value ="bookTwoclassid", required = false) Integer bookTwoclassid,
			@RequestParam(value ="bookThreeclassid", required = false) Integer bookThreeclassid,
			@RequestParam(value = "isrecommend", required = false) String isrecommend,
			@RequestParam("intro") String intro,
			@RequestParam("picture") MultipartFile file, Model model)
			throws JsonGenerationException, JsonMappingException, IOException {
		// 上传图片
		logger.info("POST---添加图书---");

		String fileName = file.getOriginalFilename();
		logger.info("原文件名" + fileName);
		String path = "O:\\picc\\";
		String newFileName = "";
		if (file != null && fileName != null && fileName.length() > 0) {
			newFileName = UUID.randomUUID()
					+ fileName.substring(fileName.lastIndexOf("."));
			File newFile = new File(path + newFileName);
			file.transferTo(newFile);

			logger.info("上传成功");
		}

		Book book = new Book();
		book.setAuthor(author);
		Integer bookclassid = null;
		System.out.println("bookThreeclassid===>"+bookThreeclassid);
		System.out.println("bookTwoclassid===>"+bookTwoclassid);
		System.out.println("bookOneclassid===>"+bookOneclassid);
		if(bookThreeclassid> new Integer(-1)){
			bookclassid =bookThreeclassid;
		}
		else if(bookTwoclassid>new Integer(-1)){
			bookclassid =bookTwoclassid;
			
		}else {
			bookclassid =bookOneclassid;
		}
		System.out.println("图书价格："+price);
		
		Double tsprice = Double.parseDouble(String.format("%.2f",price));
		System.out.println(tsprice);
		
		System.out.println(bookclassid);
		book.setBookclassid(bookclassid);
		book.setBookname(bookname);
		book.setIntro(intro);
		book.setIsbn(isbn);

		if (isrecommend == null) {
			isrecommend = "0";
		}
		logger.info(isrecommend);
		book.setPublishdate(publishdate);
		book.setIsrecommend(isrecommend);
		book.setPicture(newFileName);
		book.setPrice(tsprice);
		book.setPublish(publish);
		book.setRepertory(repertory);
		book.setSales(0);
		book.setStock(stock);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(book));
		System.out.println(book);
		bookService.addBook(book);
		return "redirect:/bookPage";
	}

	/**
	 * 测试：上传单个文件
	 * 
	 * @return
	 */
	@RequestMapping(value = "/addPicture", method = RequestMethod.GET)
	public String addPicture() {
		logger.info("GET-----文件上传-----");
		return "book/addPicture";
	}

	/**
	 * 测试：上传单个文件
	 * 
	 * @param picture
	 * @return
	 */
	@RequestMapping(value = "/addPicture", method = RequestMethod.POST)
	public String addPicture2(MultipartFile picture) {
		logger.info("POST---文件上传开始---");
		String fileName = picture.getOriginalFilename();
		logger.info("原文件名" + fileName);
		String path = "O:\\picc\\";
		String newFileName = UUID.randomUUID()
				+ fileName.substring(fileName.lastIndexOf("."));
		logger.info(newFileName);
		File newFile = new File(path + newFileName);
		logger.info(newFile);
		try {
			picture.transferTo(newFile);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("上传成功");
		return "showUser";
	}

	@RequestMapping(value = "/listBook", method = RequestMethod.GET)
	public String listBook(Model model) throws JsonGenerationException,
			JsonMappingException, IOException {
		logger.info("GET-----图书列表-----");

		List<Book> booklist = bookService.bookList();
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(booklist));
		model.addAttribute("booklist", booklist);
		return "book/listBook";
	}

	/**
	 * 删除图书
	 * 
	 * @param model
	 * @param id
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/deleteBookById/{id}")
	public String listBook(Model model, @PathVariable Integer id)
			throws JsonGenerationException, JsonMappingException, IOException {
		logger.info("-----删除图书:id为" + id + "-----");
		logger.info("传入的id为：" + id);
		int i = bookService.delete(id);

		if (i == 1) {
			logger.info("传入的id为：" + id + "删除成功");
		} else {
			logger.info("传入的id为：" + id + "删除失败，该书不存在");
		}
		return "redirect:/listBook";
	}

	/**
	 * 修改图书，图书回显
	 * 
	 * @param model
	 * @param id
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/Book/{id}", method = RequestMethod.GET)
	public String modifyBook(Model model, @PathVariable Integer id)
			throws JsonGenerationException, JsonMappingException, IOException {
		logger.info("-----修改图书:id为" + id + "-----");
		Book book = bookService.selectBook(id);
		if (book != null) {
			ObjectMapper mapper = new ObjectMapper();
			System.out.println("输出原本的图书");
			logger.info(mapper.writeValueAsString(book));
			model.addAttribute(book);
		} else {
			logger.info("传入的id为：" + id + "修改失败，该书不存在");
		}
		return "book/modifyBook";
	}

	/**
	 * 
	 * @param book
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 */
	@RequestMapping(value = "/Book/modifyBook", method = RequestMethod.POST)
	public String modifyBook2(
			@RequestParam("bookid") Integer bookid,
			@RequestParam("bookname") String bookname,
			@RequestParam("author") String author,
			@RequestParam("publish") String publish,
			@RequestParam("isbn") String isbn,
			@RequestParam("publishdate") String publishdate,
			@RequestParam("picturename") String picturename,
			@RequestParam("repertory") String repertory,
			@RequestParam("sales") Integer sales,
			@RequestParam("price") Double price,
			@RequestParam("stock") Integer stock,
			@RequestParam( value ="bookclassid",required = false) Integer bookclassid,
			@RequestParam(value = "isrecommend", required = false) String isrecommend,
			@RequestParam("intro") String intro,
			@RequestParam("picture") MultipartFile file, Model model)
			throws IllegalStateException, IOException {
		// 修改图片
		logger.info("POST---修改图书---");
		//对图片进行判断，判断是否新上传了图片
		String newFileName = "";
		if(file.getOriginalFilename()!=null){
			String fileName = file.getOriginalFilename();
			logger.info("原文件名" + fileName);
			String path = "O:\\picc\\";
			
			if (file != null && fileName != null && fileName.length() > 0) {
				newFileName = UUID.randomUUID()
						+ fileName.substring(fileName.lastIndexOf("."));
				File newFile = new File(path + newFileName);
				file.transferTo(newFile);

				logger.info("上传成功");
			}
		}
		//将原本的图片名称再次赋值给新的图书
		else{
			newFileName = picturename;
		}
		

		Book book = new Book();
		book.setBookid(bookid);
		book.setAuthor(author);
		book.setBookclassid(bookclassid);
		book.setBookname(bookname);
		book.setIntro(intro);
		book.setIsbn(isbn);

		if (isrecommend == null) {
			isrecommend = "0";
		}
		logger.info(isrecommend);
		book.setPublishdate(publishdate);
		book.setIsrecommend(isrecommend);
		book.setPicture(newFileName);
		book.setPrice(price);
		book.setPublish(publish);
		book.setRepertory(repertory);
		book.setSales(sales);
		book.setStock(stock);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("输出修改后的book");
		logger.info(mapper.writeValueAsString(book));

		int i = bookService.updateBook(book);
		System.out.println(i);
		return "redirect:/bookPage";

	}
	
	
	@RequestMapping(value = "/rank", method = RequestMethod.GET)
	public String rankBook(Model model)
			throws JsonGenerationException, JsonMappingException, IOException {
		logger.info("-----查询图书排行-----");
		List<Book> rankbook = bookService.BookRank();
		ObjectMapper mapper = new ObjectMapper();
		
		logger.info("排名榜"+mapper.writeValueAsString(rankbook));
		
		List<Book> recommendbook = bookService.BookRecommend();
		
		logger.info("推荐榜"+mapper.writeValueAsString(recommendbook));
		
		model.addAttribute("rankbook", rankbook);
		
		model.addAttribute("recommendbook", recommendbook);
		
		return "home/home";
	}
	

}
