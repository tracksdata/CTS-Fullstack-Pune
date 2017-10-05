package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		out.println("<h2>First Line SrvOne</h2>");

		request.setAttribute("name", "James"); // Scoped Objects

		RequestDispatcher rd = request.getRequestDispatcher("SrvTwo");
		rd.include(request, response);
		out.println("<h2>L Line SrvOne</h2>");
	}

}
