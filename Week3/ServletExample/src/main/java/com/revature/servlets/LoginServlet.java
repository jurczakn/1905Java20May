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

public class LoginServlet extends HttpServlet{
	
	private UserService userService = new UserServiceFake();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("login.html");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = userService.loginUser(username, password);
		
		if (user == null) {
			resp.setStatus(401);
			resp.getWriter().write("Falied Login");
		} else {
			//resp.getWriter().write("Successful Login");
			//req.getRequestDispatcher("home").forward(req, resp);
			HttpSession sess = req.getSession(true);
			sess.setAttribute("user", user);
			resp.sendRedirect("home");
		}
		
	}

}
