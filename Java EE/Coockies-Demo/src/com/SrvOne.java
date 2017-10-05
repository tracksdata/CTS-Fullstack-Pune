package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.print("<h1>SrvOne</h1>");
		
		Cookie c1=new Cookie("ename", "Praveen");
		Cookie c2=new Cookie("loc", "Pune");
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		
		
		response.sendRedirect("SrvTwo");
		
		
		

	}

}
