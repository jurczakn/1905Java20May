package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.pojos.User;

public class UserServiceFake implements UserService {
	
	private List<User> userDao;

	public User loginUser(String username, String password) {
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		
		User user = null;
		
		for (User check : userDao) {
			if(check.getUsername().equals(username) && check.getPassword().equals(password)) {
				user = check;
				break;
			}
		}
		
		return user;
	}
	
	public UserServiceFake() {
		userDao = new ArrayList<User>();
		userDao.add(new User("mah", "123", "mohamad"));
		userDao.add(new User("dinosour", "dev123", "donald"));
	}

}
