package com.booksales.dao;

import com.booksales.model.Comment;
import com.booksales.model.CommentWapper;

import java.util.List;

public interface CommentWapperMapper {
    /**
     * 根据图书id获取图书的所有的评论
     * @param bookid
     * @return
     */
	List<CommentWapper> selectCommentByBookId(Integer bookid);
}