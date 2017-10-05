package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome to SrvOne</h1>");

		request.setAttribute("name", "James"); // Scoped Objects
		ServletContext application = getServletContext();
		application.setAttribute("ename", "Praveen");

		out.print("<h2><a href='SrvTwo'>SrvTwo Servelt</a></h2>");

	}

}
