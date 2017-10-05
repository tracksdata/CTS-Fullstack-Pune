package com;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SrvOne() {
		System.out.println("SrvOne of App4 object created");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("-- First init method");
		System.out.println("Servlet Name: " + config.getServletName());
		super.init(config);
	}

	@Override
	public void init() throws ServletException {
		System.out.println("-- second init method");
	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("--- service method of SrvOne");

	}

}
