package com.booksales.service.impl;

import java.io.IOException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.dao.ClassMapper;
import com.booksales.service.ClassServiceI;

@Service("classService")
public class ClassServiceImpl implements ClassServiceI {
	
	private ClassMapper classMapper;
	
	private static Log logger = LogFactory.getLog(ClassServiceImpl.class); 
	@Autowired
	public void setClassMapper(ClassMapper classMapper) {
		this.classMapper = classMapper;
	}

	
	
	@Override
	public List<ClassMapper> SelectFatherId() {
		List<com.booksales.model.Class> classlist=classMapper.selectByFatherKey();
		
		logger.info(classlist);
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			logger.info(mapper.writeValueAsString(classlist));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
