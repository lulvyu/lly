package com.Demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Demo.Dao.UserDao;
import com.Demo.dto.User;
import com.Demo.service.IUserService;

@Service("userService")  
	public class UserServiceImpl implements IUserService {  
	    @Resource  
	    private UserDao userDao;  
	    @Override  
	    public User getUserById(int userId) {  
	        // TODO Auto-generated method stub  
	        return this.userDao.selectByPrimaryKey(userId);  
	    }  
}
