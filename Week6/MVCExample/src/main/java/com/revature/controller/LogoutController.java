package com.revature.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

public class LogoutController {
	
	@RequestMapping("/logout")
	public String logout(HttpSession sess) {
		sess.invalidate();
		return "login";
	}

}
