package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		PrintWriter out=response.getWriter();
		out.print("<h1>SrvTwo Servlet</h1>");
		
		ServletContext application= getServletContext();
		ServletConfig config=getServletConfig();
		
		out.println("<h2>Company: "+application.getInitParameter("company"));
		
		out.println("<h2>Location: "+application.getInitParameter("location"));

		out.println("<h2>Employee Id: "+config.getInitParameter("empId"));
		out.println("<h2>Employee Name: "+config.getInitParameter("empName"));
	
	
	}

}
