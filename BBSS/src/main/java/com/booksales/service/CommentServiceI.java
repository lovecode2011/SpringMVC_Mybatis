package com.booksales.service;

import java.util.List;

import com.booksales.model.Comment;

public interface CommentServiceI {
	/**
	 * 根据图书id获取图书的所有的评论
	 * @param bookid
	 * @return
	 */
	List<Comment> selectCommentByBookId(Integer bookid);

}
