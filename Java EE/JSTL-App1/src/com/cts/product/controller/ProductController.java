package com.cts.product.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.product.model.Product;

public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String option = request.getParameter("menu");

		HttpSession session = request.getSession(true);

		if (option.equals("save")) {

			Product prod = new Product();
			prod.setProdId(request.getParameter("prodId"));
			prod.setProdName(request.getParameter("prodName"));
			prod.setPrice(Double.parseDouble(request.getParameter("price")));

			List<Product> prods = (List<Product>) session.getAttribute("cart");

			if (prods == null) {
				prods = new ArrayList<>();
				prods.add(prod);
				session.setAttribute("cart", prods);
			} else {
				prods.add(prod);
				session.setAttribute("cart", prods);

			}

			/*
			 * RequestDispatcher rd = request.getRequestDispatcher("jsp/addproduct.jsp");
			 * rd.forward(request, response);
			 */

			response.sendRedirect("jsp/addproduct.jsp");

		} // save

		if (option.equals("update")) {

			String prodId = request.getParameter("prodId");
			List<Product> prods = (List<Product>) session.getAttribute("cart");

			ListIterator<Product> li = prods.listIterator();
			while (li.hasNext()) {
				Product prod = li.next();
				if (prod.getProdId().equals(prodId)) {

					request.setAttribute("product", prod);

				}// if
			} // while
			
			RequestDispatcher rd=request.getRequestDispatcher("jsp/updateform.jsp");
			rd.forward(request, response);
		} // update

		if (option.equals("update1")) {

			Product prod = new Product();
			prod.setProdId(request.getParameter("prodId"));
			prod.setProdName(request.getParameter("prodName"));
			prod.setPrice(Double.parseDouble(request.getParameter("price")));
			
			List<Product> prods = (List<Product>) session.getAttribute("cart");

			ListIterator<Product> li = prods.listIterator();
			
			while (li.hasNext()) {
				
			if(li.next().getProdId().equals(prod.getProdId())) {
				li.set(prod);// replaces
			}
				
			}
			
			response.sendRedirect("jsp/addproduct.jsp");
		} // update1

	}

}
