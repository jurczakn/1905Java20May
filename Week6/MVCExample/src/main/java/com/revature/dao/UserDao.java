package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.revature.beans.User;

@Component
public class UserDao {

	private static List<User> userRepo;
	
	public UserDao() {
		userRepo = new ArrayList<User>();
	}
	
	public User getUser(String username) {
		User ret = null;
		
		for (User u : this.userRepo) {
			if (u.getUsername().equals(username)) {
				ret = u;
				break;
			}
		}
		return ret;
	}
	
	public List<User> getAllUsers() {
		return userRepo;
	}
	
	public void saveUser(User user) {
		this.userRepo.add(user);
	}
	
}
