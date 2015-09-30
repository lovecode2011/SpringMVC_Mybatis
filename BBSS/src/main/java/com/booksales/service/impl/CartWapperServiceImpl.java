package com.booksales.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.dao.CartWapperMapper;
import com.booksales.model.CartWapper;
import com.booksales.service.CartWapperServiceI;
@Service("cartWapperService")
public class CartWapperServiceImpl implements CartWapperServiceI {
	@Autowired
	CartWapperMapper cartWapperMapper;
	private static Log logger = LogFactory.getLog(CartWapperServiceImpl.class);
	
	public List<CartWapper> selectCartForOrder(Integer useriid, Integer[] book_id) throws JsonGenerationException, JsonMappingException, IOException {
		List<Integer> bookidlist = Arrays.asList(book_id);
		
		List<CartWapper> cwlist =cartWapperMapper.selectListBookId(bookidlist);
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(cwlist));
		List<CartWapper> cwl  = new ArrayList<CartWapper>();
		for(CartWapper cw :cwlist){
			if(cw.getUserid()==useriid){
				cwl.add(cw);
			}
		}
		return cwl;
	}

	@Override
	public List<CartWapper> selectCartListByUserId(Integer userid) {
		return cartWapperMapper.selectCartListByUserId(userid);
	}
}
