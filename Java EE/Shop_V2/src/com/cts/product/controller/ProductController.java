package com.cts.product.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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

			String page = null;
			if (status) {
				request.setAttribute("msg", "Product Added Asuccesfullt to DB");
				page = "addproduct.jsp";
			} else {
				request.setAttribute("msg", "Product Not Added. There was some issue");
				page = "addproduct.jsp";
			}

			RequestDispatcher rd = request.getRequestDispatcher(page);

			rd.forward(request, response);

		}
		if (option.equals("search")) {

			String prodId = request.getParameter("prodId");
			Product prod = prodDao.findProduct(prodId);

			String page = null;

			if (prod != null) {
				request.setAttribute("product", prod);
				page = "findresults.jsp";
			} else {
				request.setAttribute("msg", "Product Id with " + prodId + " Not found in DB");
				page = "search.jsp";
			}

			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);

		}

	
		if (option.equals("update")) {
			String prodId = request.getParameter("prodId");
			Product prod = prodDao.findProduct(prodId);

			
			
			String page = null;

			if (prod != null) {
				request.setAttribute("product", prod);
				page = "updateform.jsp";
			} else {
				request.setAttribute("msg", "Product Id with " + prodId + " Not found in DB");
				page = "update.jsp";
			}

			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);

		}

		if (option.equals("update1")) {

			String prodId = request.getParameter("prodId");
			String prodName = request.getParameter("prodName");
			double price = Double.parseDouble(request.getParameter("price"));

			Product prod = new Product();
			prod.setProdId(prodId);
			prod.setProdName(prodName);
			prod.setPrice(price);

			boolean status = prodDao.updateProduct(prod);
			
			
			
			if (status) {
			request.setAttribute("msg", "Peroduct ID "+prod.getProdId()+" Updated to DB");
				
			} else {
				request.setAttribute("msg", "Product Id with "+prod.getProdId()+" Not updated");
			}
			
			RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
			rd.forward(request, response);

		}

		if (option.equals("findList")) {
			List<Product> prods = prodDao.listAll();

			request.setAttribute("prods", prods);

			RequestDispatcher rd = request.getRequestDispatcher("/search_v1.jsp");
			rd.forward(request, response);

		}

		if (option.equals("listAll")) {

			List<Product> prods = prodDao.listAll();

			request.setAttribute("products", prods);

			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);

		}

		if (option.equals("delete")) {
			

			String prodId = request.getParameter("prodId");
			boolean status = prodDao.deleteProduct(prodId);

			if (status) {
				request.setAttribute("msg", "Peroduct ID "+prodId+" Deleted from DB");
					
				} else {
					request.setAttribute("msg", "Product Id with "+prodId+" Not Deleted from DB");
				}
				
				RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");
				rd.forward(request, response);
		}

	}

}
