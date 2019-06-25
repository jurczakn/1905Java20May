package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.pojos.User;
import com.revature.services.UserService;
import com.revature.services.UserServiceFake;

public class HomeServlet extends HttpServlet{
	
	private UserService us = new UserServiceFake();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		HttpSession sess = req.getSession();
		User user = (User) sess.getAttribute("user");
		String username = user.getUsername();//req.getParameter("username");
		String password = user.getPassword();//req.getParameter("password");
		System.out.println("username" + username + " password: " + password);
		//User user = us.loginUser(username, password);
		if (user != null) {
			resp.getWriter().write("<h1>Welcome " + user.getFullname() + " </h1>");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		doGet(req, resp);
	}

}
