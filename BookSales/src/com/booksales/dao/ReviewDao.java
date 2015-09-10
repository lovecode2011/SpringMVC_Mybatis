package com.booksales.dao;

import com.booksales.model.Review;
import java.util.List;

public interface ReviewDao {
    int deleteByPrimaryKey(Integer reviewid);

    int insert(Review record);

    Review selectByPrimaryKey(Integer reviewid);

    List<Review> selectAll();

    int updateByPrimaryKey(Review record);
}