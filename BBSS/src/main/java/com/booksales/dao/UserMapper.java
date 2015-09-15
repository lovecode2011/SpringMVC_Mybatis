package com.booksales.dao;

import com.booksales.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);
    int insert2(User record);
    User selectByPrimaryKey(Integer userid);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
    
    User loginSelectPassword(String email);
}