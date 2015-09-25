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
    /**
     * 根据图书的销售量来排行
     * @return
     */
	List<Book> selectBookBySales();
	/**
	 * 根据图书添加时设置的是否推荐字段来判断是否推荐
	 * @param i
	 * @return
	 */
	List<Book> selectBookByRecommend();
	/**
	 * 查询图书的总数量
	 * @return
	 */
	int selectBookAmount();
}