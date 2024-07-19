package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class Servlet1 implements Servlet {
	
	ServletConfig conf;

	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("Iniit method...");	
	}
	
	public void destroy() {}

	public void service(ServletRequest request, ServletResponse response)throws ServletException, IOException {
		System.out.println("Service method...");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1> This is from servlet </h1>");
		
	} 
	
	public ServletConfig getServletConfig() {		
		return this.conf;
	}
	
	public String getServletInfo() {
	
		return "this is servlet created by akash";
	}
		
}

