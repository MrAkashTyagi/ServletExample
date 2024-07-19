package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class SecondServlet extends GenericServlet{
	
	public void service(ServletRequest request, ServletResponse response)throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>This is my second servlet from generic class..</h1>");
		
	}

}
