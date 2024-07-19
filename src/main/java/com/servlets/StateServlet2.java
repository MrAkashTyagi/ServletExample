package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StateServlet2
 */
@WebServlet("/StateServlet2")
public class StateServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StateServlet2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();				
		
		// getting all cookie
		Cookie[] cookies = request.getCookies();
		System.out.println(cookies);

		boolean f = false;
		String name = "";
		
		if (cookies == null) {
			out.println("<h1>you are a new user</h1>");
		}
		
		for (Cookie c : cookies) {

			String tname = c.getName();
			if (tname.equals("name")) {
				f = true;
				name = c.getValue();
			}
		}
		if (f) {

			// response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
			out.println("<h1>Hello " + name + "welcome back to my second servlet</h1>");
		} else {
			out.println("<h1>you are a new user please register</h1>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
