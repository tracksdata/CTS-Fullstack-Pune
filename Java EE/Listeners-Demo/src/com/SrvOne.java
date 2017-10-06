package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("--- Service method got called");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(true);
		ServletContext application=getServletContext();
		out.println("<h1>Welcome to SrvOne</h1>");
		out.println("<h1>Page Count: "+request.getAttribute("pageCount"));
		out.println("<h1>Active Users: "+application.getAttribute("userCount"));
		out.println("<h3><a href='SrvTwo'>Logout</a></h3>");
	
	}

}
