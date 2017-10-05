package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();	
		out.print("<h1>SrvTwo</h1>");
		
		String s1=request.getParameter("ename");
		String s2=request.getParameter("lname");
		String s3=request.getParameter("loc");
		
	//	HttpSession session=request.getSession(false);
		
		
		out.println("<h2>EmpName: "+s1);
		out.println("<h2>Last Name: "+s2);
		out.println("<h2>Loc: "+s3);
		
		//session.removeAttribute("ename");
		//session.setMaxInactiveInterval(5);
		
		//session.invalidate();
	}

}
