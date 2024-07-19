package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		System.out.println("This is http servlet get method....");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>This is http servlet get method... </h1>");
		out.println(new Date().toString());
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("This is http servlet method post method...");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>This is post method of http servlet</h1>");		
	}
	

}
