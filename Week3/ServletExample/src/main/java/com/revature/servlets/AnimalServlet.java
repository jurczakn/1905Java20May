package com.revature.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside doGet of Animal Servlet");
		HttpSession sess = request.getSession(false);
		if (sess == null || sess.getAttribute("user") == null) {
			response.sendRedirect("login");
			return;
		}
		User user = (User) sess.getAttribute("user");
		
		List<Animal> aList = as.getAnimalsByOwner(user);
		
		String result = "";
		
		for (Animal a : aList) {
			result += a.getName() + " ";
		}
		
		response.getWriter().append(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
