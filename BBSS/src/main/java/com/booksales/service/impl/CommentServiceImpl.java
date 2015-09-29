package com.booksales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.dao.CommentMapper;
import com.booksales.model.Comment;
import com.booksales.service.CommentServiceI;

@Service("commentService")
public class CommentServiceImpl implements  CommentServiceI{
	@Autowired
	CommentMapper commentMapper;

	@Override
	public List<Comment> selectCommentByBookId(Integer bookid) {
		return commentMapper.selectCommentByBookId(bookid);
	}
}
