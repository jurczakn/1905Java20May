package com.revature.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.beans.User;
import com.revature.beans.UserDTO;
import com.revature.service.AuthService;

@Controller
public class LoginController {

	AuthService authService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGet(HttpSession sess, ModelMap modelMap) {

		if (sess.getAttribute("user") != null) {
			modelMap.addAttribute("user", sess.getAttribute("user"));
			return "home";
		}

		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(User user, ModelMap modelMap, HttpSession sess) {
		User authUser = authService.validateUser(user);

		if (authUser != null) {
			sess.setAttribute("user", authUser);
			modelMap.addAttribute("user", authUser);
			return "home";

		} else {
			modelMap.addAttribute("error", "Username or Password did not match");
		}

		return "login";

	}

	@PostMapping(value = "/authenticate", consumes = {"application/json"})
	public @ResponseBody User loginPost(@RequestBody UserDTO userDTO, HttpSession sess) {
		
		User user = new User(userDTO);
		
		User authUser = authService.validateUser(user);

		if (authUser != null) {
			sess.setAttribute("user", authUser);
			Logger.getAnonymousLogger().log(Level.INFO, "user" + authUser);
			return authUser;
		}
		
		return null;
	}

	@Autowired
	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}

}
