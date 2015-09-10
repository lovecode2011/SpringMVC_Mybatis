package com.booksales.dao;

import com.booksales.model.User;
import java.util.List;

public interface UserDao {
	/**
	 * 根据用户id删除用户信息
	 * --一般建议不要删除
	 * @param userid
	 * @return
	 */
    int deleteByUserId(Integer userid);
    /**
     * 添加用户
     * @param user
     * @return
     */
    int insert(User user);
    /**
     * 根据用户id查找用户
     * @param userid
     * @return
     */
    User selectByUserId(Integer userid);
    /**
     * 检索全部用户
     * @return
     */
    List<User> selectAll();
    /**
     * 更新用户信息
     * @param user 
     * @return
     */
    int update(User user);
}