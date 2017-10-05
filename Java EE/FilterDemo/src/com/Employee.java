package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Employee() {
	System.out.println("--- Employeee Class Object created");
	}   
    @Override
    public void init() throws ServletException {
    	System.out.println("--- Employee class init called");
    }
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("-- service method pf Employee called");
		PrintWriter out=response.getWriter();
		out.println("<h1>Welcome to Employee Managment System<h1><hr/>");
		
	}

}
