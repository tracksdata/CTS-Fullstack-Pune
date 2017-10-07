<%@page import="com.Product"%>

<%

Product prod=new Product();

String prodId=request.getParameter("prodId");
String prodName=request.getParameter("prodName");
double price=Double.parseDouble(request.getParameter("price"));

prod.setProdId(prodId);
prod.setProdName(prodName);
prod.setPrice(price);

request.setAttribute("product", prod);


RequestDispatcher rd=request.getRequestDispatcher("/display.jsp");
rd.forward(request, response);


%>
