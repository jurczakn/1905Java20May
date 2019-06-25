package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doGet of LifeCycleServlet");
		resp.getWriter().write("<h1>Success</h1>");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside service method of LifeCycleServlet");
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Inside destroy method of LifeCycleServlet");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Inside init method of LifeCycleServlet");
		super.init();
	}

	
	
}
