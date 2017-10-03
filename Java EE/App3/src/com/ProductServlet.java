package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="PS",loadOnStartup = 10,urlPatterns= {"/p2","/p3","/p1"})

public class ProductServlet extends HttpServlet {
	public ProductServlet() {

		System.out.println("---- ProductServlet object created");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("---- init method of Product Servlet");
	}

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<h2>Product Servlet");

	}

}
