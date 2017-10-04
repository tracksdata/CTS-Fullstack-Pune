package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		
		String s1= request.getParameter("fname");
		
		String s2=request.getParameter("lname");
		
		String s3=request.getParameter("gen");
		
		String s4=request.getParameter("course");
		
	//	String dateOfBirth=request.getParameter("dob");
		
		String[] hobbies= request.getParameterValues("hob");
		
		
		out.println("<h2>First Name: "+s1);
		out.println("<h2>Last Name: "+s2);
		out.println("<h2>Gender: "+s3);
		out.println("<h2>Course Selected: "+s4);
		//out.println("<h2>Date of Birth: "+dateOfBirth);
		out.println("<h2>Hobbies");
		for(String hob:hobbies) {
			out.println("<h2>: "+hob);
		}
		out.println("<h3><a href='Form.html'>Add Another Record</a></h3>");
		
		
		
		
		
	}

}
