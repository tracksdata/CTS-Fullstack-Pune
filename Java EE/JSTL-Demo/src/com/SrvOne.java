package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		List<String> friends=new ArrayList<>();
		
		friends.add("Abc");
		friends.add("Xyz");
		friends.add("Test");
		friends.add("Bla");
		friends.add("Chek");
		
		request.setAttribute("myFriends", friends);
		
		
		Product p1=new Product("P001", "Pen", 56);
		Product p2=new Product("P002", "BLue Pen", 16);
		Product p3=new Product("P003", "Red Pen", 52);
		Product p4=new Product("P004", "Green Pen", 36);
		Product p5=new Product("P005", "Yellow Pen", 45);
		
		List<Product> prods=new ArrayList<>();
		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		prods.add(p5);

		request.setAttribute("products", prods);
		
		
		
	
		
		String countries[]= {"India","USA","UK","China"};
		
		
		request.setAttribute("myCountries", countries);
		
		request.setAttribute("userName", "Praveen");
		HttpSession session = request.getSession(true);
		session.setAttribute("userName", "James");

		RequestDispatcher rd = request.getRequestDispatcher("/two.jsp");
		rd.forward(request, response);

		
	
	
	}

}
