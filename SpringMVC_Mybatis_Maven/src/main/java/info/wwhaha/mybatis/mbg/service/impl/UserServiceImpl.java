package info.wwhaha.mybatis.mbg.service.impl;

import info.wwhaha.mybatis.mbg.dao.mapper.UserMapper;
import info.wwhaha.mybatis.mbg.model.User;
import info.wwhaha.mybatis.mbg.service.IUserService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserMapper userDao;  
  
    public User getUserById(int userId) {  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
}  