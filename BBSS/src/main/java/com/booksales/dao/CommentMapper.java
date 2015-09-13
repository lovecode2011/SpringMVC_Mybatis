package com.booksales.dao;

import com.booksales.model.Comment;
import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer commentid);

    int insert(Comment record);

    Comment selectByPrimaryKey(Integer commentid);

    List<Comment> selectAll();

    int updateByPrimaryKey(Comment record);
}