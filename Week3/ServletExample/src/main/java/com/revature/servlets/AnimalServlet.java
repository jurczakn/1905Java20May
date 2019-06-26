package com.revature.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.pojos.Animal;
import com.revature.pojos.User;
import com.revature.services.AnimalService;
import com.revature.services.AnimalServiceFake;

/**
 * Servlet implementation class AnimalServlet
 */
public class AnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	AnimalService as = new AnimalServiceFake();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AnimalServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession(false);
		if (sess == null || sess.getAttribute("user") == null) {
			response.sendRedirect("login");
			return;
		}
		String name = request.getPathInfo();
		if (name == null || name.substring(1) == "") {

			User user = (User) sess.getAttribute("user");

			List<Animal> aList = as.getAnimalsByOwner(user);

			String result = "";

			for (Animal a : aList) {
				result += a.getName() + " ";
			}

			response.getWriter().append(result);
			return;
		}
		System.out.println(name.substring(1));
		Animal a = as.getAnimalByName(name.substring(1));
		System.out.println(a);
		/*
		 * response.getWriter().write( "{\"name\":\"" + a.getName() +
		 * "\", \"breed\":\""+a.getBreed() + "\", \"color\":\""+a.getColor() +
		 * "\", \"age\":"+a.getAge() + "}" );
		 */
		ObjectMapper om = new ObjectMapper();
		String animalString = om.writeValueAsString(a);
		response.getWriter().write(animalString);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession(false);
		if (sess == null || sess.getAttribute("user") == null) {
			response.sendRedirect("login");
			return;
		}
		String body = request.getReader().readLine();
		System.out.println(body);
		ObjectMapper om = new ObjectMapper();
		Animal a = om.readValue(body, Animal.class);
		a.setOwner((User)sess.getAttribute("user"));
		as.createAnimal(a);
		response.getWriter().write("Animal successfuly created");
	}

}
