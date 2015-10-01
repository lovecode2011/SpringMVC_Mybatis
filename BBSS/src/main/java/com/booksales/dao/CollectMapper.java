package com.booksales.dao;

import com.booksales.model.Collect;

import java.util.List;

public interface CollectMapper {
    int deleteByPrimaryKey(Integer collectid);

    int insert(Collect record);

    Collect selectByPrimaryKey(Integer collectid);

    List<Collect> selectAll();

    int updateByPrimaryKey(Collect record);

	List<Collect> selectByUserId(Integer userid);
	/**
	 * 根据用户id和图书id删除收藏记录
	 * @param userid
	 * @param bookid
	 * @return
	 */
	int deleteCollect(Collect collect);
	/**
	 * 根据用户id和bookid查找收藏吧，判断用户之前是否收藏了该图书
	 * @param collect
	 * @return
	 */
	Collect selectCollectUserIdBookId(Collect collect);

}