package com.booksales.service;

import java.util.List;

import com.booksales.model.CommentWapper;

public interface CommentWapperServiceI {
	/**
	 * 根据图书id获取图书的所有的评论
	 * @param bookid
	 * @return
	 */
	List<CommentWapper> selectCommentByBookId(Integer bookid);

}
