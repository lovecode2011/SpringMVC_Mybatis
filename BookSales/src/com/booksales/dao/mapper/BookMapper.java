package com.booksales.dao.mapper;

import com.booksales.model.Book;
import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer bookid);

    int insert(Book record);

    Book selectByPrimaryKey(Integer bookid);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}