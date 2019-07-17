package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.revature.beans.User;
import com.revature.service.AuthService;

@Controller
public class LoginController {

	AuthService authService;
	
	public String loginPost(User user) {
		User authUser = authService.validateUser(user);
		
		if (authUser != null) {
			
			return "home";
			
		}
		
		return "login";
		
	}
	
	@Autowired
	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}
	
}
