package com.ljw.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljw.dao.UserDao;
import com.ljw.dto.User;
import com.ljw.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;
	@Override
	public User queryById(int id) {
		return userDao.queryById(id);
	}

	
}
