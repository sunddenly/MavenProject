package com.hebut.multi.web.service;


import com.hebut.multi.web.model.User;

public interface IUserService {
	public void add(User user);
	
	public User loadByUsername(String username);
}
