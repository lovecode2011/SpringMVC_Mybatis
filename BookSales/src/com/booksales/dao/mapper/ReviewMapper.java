package com.booksales.dao.mapper;

import com.booksales.model.Review;
import java.util.List;

public interface ReviewMapper {
    int deleteByPrimaryKey(Integer reviewid);

    int insert(Review record);

    Review selectByPrimaryKey(Integer reviewid);

    List<Review> selectAll();

    int updateByPrimaryKey(Review record);
}