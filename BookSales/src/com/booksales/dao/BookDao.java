package com.booksales.dao;

import com.booksales.model.Book;
import java.util.List;

public interface BookDao {
    int deleteByPrimaryKey(Integer bookid);

    int insert(Book record);

    Book selectByPrimaryKey(Integer bookid);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}