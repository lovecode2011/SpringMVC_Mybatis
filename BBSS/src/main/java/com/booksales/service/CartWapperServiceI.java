package com.booksales.service;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.booksales.model.Cart;
import com.booksales.model.CartWapper;

public interface CartWapperServiceI {
	/**
	 * 根据用户id和图书id集合查询cart中的cartwapper
	 * @param useriid
	 * @param book_id
	 * @return
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 */
	List<CartWapper> selectCartForOrder(Integer useriid, Integer[] book_id) throws JsonGenerationException, JsonMappingException, IOException;

}
