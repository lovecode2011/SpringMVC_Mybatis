package com.booksales.dao;

import com.booksales.model.Notice;
import java.util.List;

public interface NoticeDao {
    int deleteByPrimaryKey(Integer noticeid);

    int insert(Notice record);

    Notice selectByPrimaryKey(Integer noticeid);

    List<Notice> selectAll();

    int updateByPrimaryKey(Notice record);
}