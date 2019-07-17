package com.revature.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.User;

@Service
public class AuthService {
	
	private static Logger log = Logger.getLogger("AUTH_LOGGER");
	
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public User validateUser(User user) {
		
		log.log(Level.INFO, "Attempted Login: " + user);
		
		User validatedUser = userService.getUserByUsername(user.getUsername());
		
		log.log(Level.INFO, "Actual Credentials: " + validatedUser);
		
		if(validatedUser != null && validatedUser.getPassword().equals(user.getPassword())) {
			return validatedUser;
		}
		
		return null;
		
	}

}
