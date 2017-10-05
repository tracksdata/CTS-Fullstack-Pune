package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out=response.getWriter();	
	HttpSession session=request.getSession(true);
	
	out.print("<h1>SrvOne</h1>");
	out.println("<h2>Sesion Id: "+session.getId());
	out.println("<h2>Is New: "+session.isNew());
	
	String empName=request.getParameter("empName");
	out.println("<h2>EmpName: "+empName);
	
	session.setAttribute("ename", "Praveen");
	
	response.sendRedirect("SrvTwo");
		
	
		
	}

}
