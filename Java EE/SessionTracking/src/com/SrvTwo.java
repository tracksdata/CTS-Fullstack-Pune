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
		
		HttpSession session=request.getSession(false);
		
		
		out.println("<h2>EmpName: "+session.getAttribute("ename"));
		
		//session.removeAttribute("ename");
		//session.setMaxInactiveInterval(5);
		
		//session.invalidate();
	}

}
