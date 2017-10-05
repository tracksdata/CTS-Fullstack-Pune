package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<h1>SrvTwo</h1>");

		Cookie cookies[] = request.getCookies();

		for (Cookie c1 : cookies) {
			if (c1.getName().equals("ename"))
				out.println("Ename is " + c1.getValue());
			if (c1.getName().equals("loc"))
				out.println("Location is " + c1.getValue());
		}

	}

}
