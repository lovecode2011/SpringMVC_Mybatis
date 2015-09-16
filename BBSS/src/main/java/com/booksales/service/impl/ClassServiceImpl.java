package com.booksales.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.service.ClassServiceI;
import com.booksales.dao.ClassMapper;
import com.booksales.model.Class;

@Service("classService")
public class ClassServiceImpl implements ClassServiceI {
	
	private ClassMapper classMapper;
	
	private static Log logger = LogFactory.getLog(ClassServiceImpl.class); 
	@Autowired
	public void setClassMapper(ClassMapper classMapper) {
		this.classMapper = classMapper;
	}

	
	
	@Override
	public List<Class> SelectFatherId() {
		
		List<Class> classlist=classMapper.selectByFatherKey();
		return classlist;
	}



	@Override
	public int addClassify(Class clazz) {
		int i =classMapper.insert(clazz);
		return i;
	}



	@Override
	public List<Class> selectByFatherId(String fatherid) {
		Integer id= Integer.parseInt(fatherid);
		List<Class> classlist=	classMapper.selectSubClassByFatherId(id);
		return classlist;
	}




}
