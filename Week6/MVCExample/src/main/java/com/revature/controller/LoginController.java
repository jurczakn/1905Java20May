package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.beans.User;
import com.revature.service.AuthService;

@Controller
public class LoginController {

	AuthService authService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginGet() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginPost(User user, ModelMap modelMap) {
		User authUser = authService.validateUser(user);
		
		if (authUser != null) {
			
			return "home";
			
		} else {
			modelMap.addAttribute("error", "Username or Password did not match");
		}
		
		return "login";
		
	}
	
	@Autowired
	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}
	
}
