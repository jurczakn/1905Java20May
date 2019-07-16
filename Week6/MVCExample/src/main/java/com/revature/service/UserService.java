package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.beans.User;
import com.revature.dao.UserDao;

@Component
public class UserService {
	
	private UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public User getUserByUsername(String username) {
		return userDao.getUser(username);
	}
	
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
	
	public void registerUser(User user) {
		userDao.saveUser(user);
	}

}
