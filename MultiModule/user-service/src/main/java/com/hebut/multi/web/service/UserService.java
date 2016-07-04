package com.hebut.multi.web.service;


import com.hebut.multi.web.dao.IUserDao;
import com.hebut.multi.web.model.User;

public class UserService implements IUserService {
	private IUserDao userDao;

	public UserService(IUserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public void add(User user) {
		userDao.add(user);
	}

	public User loadByUsername(String username) {
		return userDao.loadByUsername(username);
	}

}
