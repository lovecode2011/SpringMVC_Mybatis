package com.booksales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksales.dao.CommentWapperMapper;
import com.booksales.model.CommentWapper;
import com.booksales.service.CommentWapperServiceI;

@Service("commentWapperService")
public class CommentWapperServiceImpl implements  CommentWapperServiceI{
	@Autowired
	CommentWapperMapper commentWapperMapper;

	@Override
	public List<CommentWapper> selectCommentByBookId(Integer bookid) {
		return commentWapperMapper.selectCommentByBookId(bookid);
	}
}
