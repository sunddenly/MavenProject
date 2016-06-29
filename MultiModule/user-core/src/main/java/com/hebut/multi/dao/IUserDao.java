package com.hebut.multi.dao;


import com.hebut.multi.model.User;

public interface IUserDao {
	public void add(User user);
	public User loadByUsername(String username);
}
