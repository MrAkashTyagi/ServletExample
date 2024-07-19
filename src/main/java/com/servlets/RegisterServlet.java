package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

public class RegisterServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1> Welcome to Register Servlet </h1>");

		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String password = request.getParameter("user_password");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		String condition = request.getParameter("condition");

		if (condition != null) {
			if (condition.equals("checked")) {
				out.println("<h1> Name : " + name + "</h1>");
				out.println("<h1> Password : " + password + " </h1>");
				out.println("<h1> Email : " + email + "</h1>");
				out.println("<h1> Gender : " + gender + "</h1>");
				out.println("<h1> Course : " + course + "</h1>");
				
				
				///
				//JDBC
				//
				
				//saved to db
				RequestDispatcher rd = request.getRequestDispatcher("success");
				rd.forward(request, response);

				
				
			} else {
				out.println("<h1>you have not accepted terms and condition</h1>");
			}

		} else {
			out.println("<h1>you have not accepted terms and condition</h1>");			
			//get output of index.html here			
			//get object of RequestDispatcher			
			RequestDispatcher red = request.getRequestDispatcher("index.html");			
			//include it here			
			red.include(request, response);			
		}
	}
}
