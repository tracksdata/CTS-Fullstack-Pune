package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public  void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("--- SrvTwo service method");
		
		PrintWriter out=response.getWriter();
		
		out.println("<h2>Welcome to SrvTwo Servlet</h1>");
		out.println("<h2><a href='data'>Go to SrvOne</a> </h2>");
		
		
		
		
	}

}
