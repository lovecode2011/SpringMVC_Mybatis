package com.booksales.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.booksales.dao.BookMapper;
import com.booksales.dao.ClassMapper;
import com.booksales.model.Book;
import com.booksales.model.Class;
import com.booksales.service.BookServiceI;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("bookService")
public class BookServiceImpl implements BookServiceI {
	@Autowired
	BookMapper bookMapper;
	@Autowired
	ClassMapper classMapper;
	private static Log logger = LogFactory.getLog(BookServiceImpl.class);

	public int addBook(Book book) {
		logger.info("Service  ----addBook");
		int i = bookMapper.insert(book);
		return i;

	}
	
	@Override
	public int delete(int i) {
		return bookMapper.deleteByPrimaryKey(i);
	}

	@Override
	public List<Book> bookList() {
		
		return bookMapper.selectAll();
	}

	@Override
	public Book selectBook(Integer id) {
		return bookMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageInfo<Book> bookpage() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Book> booklist= bookMapper.selectAll();
	System.out.println("----------------------------");
		logger.info(mapper.writeValueAsString(booklist));
		PageInfo<Book> page = new PageInfo<Book>(booklist);
		System.out.println("----------------------------");
		logger.info(mapper.writeValueAsString(page));
		return page;
	}
	
	public PageInfo<Book> bookpage2(HttpServletRequest request) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		PageHelper.startPage(request);
		List<Book> booklist= bookMapper.selectAll();
	System.out.println("----------------------------");
		logger.info(mapper.writeValueAsString(booklist));
		PageInfo<Book> page = new PageInfo<Book>(booklist);
		System.out.println("----------------------------");
		logger.info(mapper.writeValueAsString(page));
		return page;
	}

	public int updateBook(Book book) {
		
	return bookMapper.updateByPrimaryKey(book);
	}

	/**
	 * 根据图书销售量来排行
	 */
	public List<Book> BookRank() {
		return bookMapper.selectBookBySales();
	}

	/**
	 * 通过是否推荐的关键字来判断
	 */
	public List<Book> BookRecommend() {
		
		return bookMapper.selectBookByRecommend();
	}

	@Override
	public int selectBookAmount() {
		
		return bookMapper.selectBookAmount();
	}

	@Override
	public List<Book> selectBookListByClassifyId(Integer classifyid) {
		List<Book> result = new ArrayList<Book>(); 
		//先获取该分类。
	    Class c1 = classMapper.selectByPrimaryKey(classifyid);
	    System.out.println("分类的父类"+c1.getClassfatherid());
	    //判断该分类是不是一级分类
	    if(c1.getClassfatherid()==0){
	    	result.addAll(bookMapper.selectBookListByClassifyId(classifyid));
			//查询该分类的所有子类分类
			List<Class> classlist= classMapper.selectSubClassByFatherId(classifyid);
			List<Integer> classidlist =new ArrayList<Integer>();
			for(Class c:classlist){
				
				result.addAll(bookMapper.selectBookListByClassifyId(c.getClassid()));
				List<Class> c2list= classMapper.selectSubClassByFatherId(c.getClassid());
				for(Class cc :c2list){
					result.addAll(bookMapper.selectBookListByClassifyId(cc.getClassid()));
				}
			}
			return result;
	    	
	    }else{
	    	result.addAll(bookMapper.selectBookListByClassifyId(classifyid));
			//查询该分类的所有子类分类
			List<Class> classlist= classMapper.selectSubClassByFatherId(classifyid);
			List<Integer> classidlist =new ArrayList<Integer>();
			for(Class c:classlist){
				result.addAll(bookMapper.selectBookListByClassifyId(c.getClassid()));
			}
			return 	result;
	    }
		
	}

	@Override
	public List<Book> selectBookLike(String search) {
		List<Book> booklist = new ArrayList<Book>();
		//模糊查询bookname并加入booklist
		booklist.addAll(bookMapper.selectBookLikeBookName(search));
		//模糊查询author并加入booklist
		booklist.addAll(bookMapper.selectBookLikeBookAuthor(search));
		//模糊查询intro并加入booklist
		booklist.addAll(bookMapper.selectBookLikeBookIntro(search));
		return  booklist;
	}

}
