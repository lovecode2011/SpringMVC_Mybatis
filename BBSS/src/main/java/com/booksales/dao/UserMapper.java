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
    /**
     * 查询数据库中否是有username这个名字
     * @param username
     * @return 返回user不为空，表示该用户名已经注册
     */
	User selectUserName(String username);
	/**
	 * 查询数据库中是否有人已经用了这个email
	 * @param email
	 * @return
	 */
	User selectUserByEmail(String email);
}