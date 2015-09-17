package com.booksales.dao;

import com.booksales.model.Book;
import java.util.List;

public interface BookMapper {
	
    int deleteByPrimaryKey(Integer bookid);
    /**
     * 添加图书到数据库
     * @param record
     * @return
     */
    int insert(Book record);

    Book selectByPrimaryKey(Integer bookid);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}