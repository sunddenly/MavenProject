package com.hebut.multi.web.dao;


import com.hebut.multi.web.model.User;

public interface IUserDao {
	public void add(User user);
	public User loadByUsername(String username);
}
