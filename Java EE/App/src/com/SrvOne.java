package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("--- service method of SrvOne ....");
		
		PrintWriter out=response.getWriter();
		
		out.println("<h1>My First Server side Program</h1>");
		out.println("<h1>Welcome to my Application SrvOne</h1>");
		out.println("<h1> <a href='data'>Go to SrvTwo</a></h1>");
		
		
	}

}
