package com.test.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.booksales.dao.BookMapper;
import com.booksales.dao.UserMapper;
import com.booksales.model.Book;
import com.booksales.model.User;
import com.booksales.util.MybatisUtil;

public class TestBookDao {
	private static SqlSessionFactory sqlSessionFactory =  MybatisUtil.getSessionFactory();
    
	
	
public static void main(String[] args) {
	//testAdd();
	testAddBook();
	//deleteBook();
	//deleteUser();
}    
    
    public static  void testAdd() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user =new User();
            user.setEmail("898979@qq.com");
            user.setPassword("111");
            user.setUsername("grgr");
            userMapper.insert2(user);
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
        } finally {
            sqlSession.close();
        }
    }
public  static void deleteUser(){
		
		SqlSession session =  sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		userMapper.deleteByPrimaryKey(10);
		session.commit();
		session.close();
	}
public  static void deleteBook(){
		
		SqlSession session =  sqlSessionFactory.openSession();
		BookMapper bookMapper = session.getMapper(BookMapper.class);
		bookMapper.deleteByPrimaryKey(6);
		session.commit();
		session.close();
	}
    
    public static  void testAddBook() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
            
            Book book = new Book();
    		book.setAuthor("ergnognr");
    		book.setBookname("bookname");
    		book.setPublish("bookname");
    		book.setIsbn("35435");
    		book.setBookclassid(34);
    		book.setPrice(33L);
    		book.setStock(43);
    		book.setPublishdate("2011-11-11");
    		bookMapper.insert(book);
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
        } finally {
            sqlSession.close();
        }
    }
}
