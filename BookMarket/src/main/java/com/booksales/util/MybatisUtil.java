package com.booksales.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	
	private static SqlSessionFactory sessionFactory = null;
	public static SqlSessionFactory getSessionFactory(){
		if(sessionFactory != null)
			return sessionFactory;
		
		
		MybatisUtil.class.getClassLoader();
		//mybatis的配置文件
	    InputStream is =  ClassLoader.getSystemResourceAsStream("com/booksales/util/GeneratedMapperConfig.xml");
	    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sessionFactory;
	}
	
}
