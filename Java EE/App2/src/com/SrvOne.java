package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvOne extends HttpServlet {

	public SrvOne() {

		System.out.println("-- SrvOne Servlet Object Created----");
	}

	@Override
	public void init() throws ServletException {

		System.out.println("-- init method of SrvOne got called---");
	}

	@Override
	public void destroy() {

		System.out.println("-- Destroy method of SrvOne got called");

	}

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("-- SrvOne service method git called");
		PrintWriter out = response.getWriter();
		
		
		out.println("<h1>Welcome to SrvOne</h1>");

	}

}
