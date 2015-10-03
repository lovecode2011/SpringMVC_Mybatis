package com.booksales.dao;

import com.booksales.model.Book;
import com.booksales.model.Class;

import java.util.Collection;
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
	
	/**
	 * 根据bookclassifyid查询该分类的图书list
	 * @param classifyid
	 * @return
	 */
	List<Book> selectBookListByClassifyId(Integer bookclassid);
	
	/**
	 * 根据分类id集合查询该分类集合中所有图书集合
	 * @param classlist
	 * @return
	 */
	List<Book> selectBookListByClassIdList(List<Integer> classidlist);
	/**
	 * 根据bookname模糊查询
	 * @param search
	 * @return
	 */
	List<Book> selectBookLikeBookName(String bookname);
	/**
	 * 根据bookauthor模糊查询
	 * @param search
	 * @return
	 */
	List<Book> selectBookLikeBookAuthor(String author);
	/**
	 * 根据intro模糊查询
	 * @param search
	 * @return
	 */
	List<Book> selectBookLikeBookIntro(String intro);
}