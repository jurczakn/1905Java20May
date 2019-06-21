package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		System.out.println("Hello World!!!!");
		PrintWriter pw = resp.getWriter();
		pw.write("Hello World from servlet doGet method!!!!!");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		System.out.println("Hello Post???");
		PrintWriter pw = resp.getWriter();
		pw.write("Hello World from servlet doPost method!!!!!!");
	}

}
