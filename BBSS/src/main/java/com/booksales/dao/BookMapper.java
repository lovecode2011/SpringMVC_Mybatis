package com.booksales.dao;

import com.booksales.model.Book;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

public interface BookMapper {
	/**
	 * 根据bookid删除图书
	 * @param bookid
	 * @return
	 */
    int deleteByPrimaryKey(Integer bookid);
    /**
     * 添加图书到数据库
     * @param record
     * @return
     */
    int insert(Book record);

    Book selectByPrimaryKey(Integer bookid);
    /**
     * 查询所有图书
     * @return
     */
    List<Book> selectAll();
    List<Book> selectAll(RowBounds rowBounds);

    int updateByPrimaryKey(Book record);
}