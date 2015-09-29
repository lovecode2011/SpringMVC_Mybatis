package com.booksales.service;

import java.util.List;

import com.booksales.model.Collect;

public interface CollectServiceI {

	int collectBook(Integer userid, Integer bookid);

	List<Collect> listCollect(Integer userid);
	/**
	 * 根据bookid 和userid判断该用户是否已经收藏了该书
	 * @param bookid
	 * @param userid
	 * @return true==》收藏 ；false===>没有收藏
	 */
	boolean selectCollect(Integer bookid, String userid);
	/**
	 * 根据用户id和图书id删除该条收藏
	 * @param userid
	 * @param bookid
	 * @return
	 */
	int delcollectBook(Integer userid, Integer bookid);

}
