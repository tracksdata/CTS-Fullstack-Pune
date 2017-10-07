package com.cts.product.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.model.Product;

public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String option = request.getParameter("menu");

		ProductDaoImpl prodDao = new ProductDaoImpl();

		if (option.equals("save")) {

			String prodId = request.getParameter("prodId");
			String prodName = request.getParameter("prodName");
			double price = Double.parseDouble(request.getParameter("price"));

			Product prod = new Product();
			prod.setProdId(prodId);
			prod.setProdName(prodName);
			prod.setPrice(price);

			boolean status = prodDao.saveProduct(prod);

			if (status) {
				response.sendRedirect("index.html");
			} else {
				response.sendRedirect("error.html");
			}

			System.out.println("--- saving");
		}
		if (option.equals("search")) {
			System.out.println("-- searching");
			
			String prodId=request.getParameter("prodId");
			Product prod= prodDao.findProduct(prodId);
			
			if(prod!=null) {
				out.println("<html><body><table border=1>");
				out.println("<tr><th>Product Id</th><th>Product Name</th><th>Price</th></tr>");
				out.println("<tr>");
				out.println("<td>"+prod.getProdId()+"</td>");
				out.println("<td>"+prod.getProdName()+"</td>");
				out.println("<td>"+prod.getPrice()+"</td>");
				out.println("</tr>");
				out.println("</table>");
			
			}else {
				out.println("<h2>Product Id "+prodId+" is not found in DB");
				out.println("<h2><a href='search.html'>Search Again</a>");
			}
			
			
		}

		if (option.equals("update")) {
			System.out.println("Updating");
			
			String prodId=request.getParameter("prodId");
			Product prod= prodDao.findProduct(prodId);
			
			if(prod!=null) {
				
				out.println("<html><body><form action='prodController?menu=update1' method='post'><table>");
				out.println("<tr>");
					out.println("<td>Product Id</td>");
					out.println("<td> <input type=text name=prodId value="+prod.getProdId()+" readonly=true> </td>");
				out.println("</tr>");
				
				out.println("<tr>");
					out.println("<td>Product Name</td>");
					out.println("<td> <input type=text name=prodName value="+prod.getProdName()+"> </td>");
				out.println("</tr>");
			
			
				out.println("<tr>");
					out.println("<td>Price</td>");
					out.println("<td> <input type=text name=price value="+prod.getPrice()+"> </td>");
				out.println("</tr>");
			
			out.println("<tr>");
					out.print("<th colspan=2>");
					out.println("<input type=submit value=Update></th>");
			out.println("</tr>");
			
			out.println("</table></form>");
			}
		}
		
		if(option.equals("update1")) {
			
			
			String prodId = request.getParameter("prodId");
			String prodName = request.getParameter("prodName");
			double price = Double.parseDouble(request.getParameter("price"));

			Product prod = new Product();
			prod.setProdId(prodId);
			prod.setProdName(prodName);
			prod.setPrice(price);
			
			boolean status= prodDao.updateProduct(prod);
			
			if(status) {
				out.println("<h2>Product Updated</h2>");
				out.println("<h3><a href='index.html'>Home</a>");
			}else {
				out.println("<h2>Product is not updated.. Issue with DB");
				out.println("<h3><a href='index.html'>Home</a>");
			}
			
		}
		
		if(option.equals("findList")) {
			List<Product> prods= prodDao.listAll();
			out.println("<form action=prodController?menu=search method=post>");
			out.println("<html><body><table border=1>");
			out.println("<tr><th>Product Id</th>");
			
			out.println("<td><select name=prodId>");
		//	out.println("");
			for(Product prod:prods) {
				out.println("<option>");
				out.println(prod.getProdId());
			}
			out.println("</select></td> </tr> ");
			out.println("<tr><th colspan=2><input type=submit value=Search></th></form>");
			
			out.println("</table>");
		
		}
		

		if (option.equals("listAll")) {
			System.out.println("-- listing all");
			List<Product> prods= prodDao.listAll();
			
			out.println("<html><body><table border=1>");
			out.println("<tr><th>Product Id</th><th>Product Name</th><th>Price</th></tr>");
			
			for(Product prod:prods) {
				out.println("<tr>");
				out.println("<td>"+prod.getProdId()+"</td>");
				out.println("<td>"+prod.getProdName()+"</td>");
				out.println("<td>"+prod.getPrice()+"</td>");
				out.println("</tr>");
				
			}
			
			
			out.println("</table>");
			
			
			
			
		}

		if (option.equals("delete")) {
			System.out.println("--- deleting..");
			
			String prodId=request.getParameter("prodId");
			boolean  status= prodDao.deleteProduct(prodId);
		
			if(status) {
				out.println("<h2>Product "+prodId+" deleted from DB</h2>");
				out.println("<h3><a href='index.html'>Home</a>");
			}else {
				out.println("<h2> "+prodId+"Product is not found in DB");
				out.println("<h3><a href='index.html'>Home</a>");
			}
	}

	}

}
