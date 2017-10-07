<%@page import="com.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Product Display V1_</h2> <hr/>
	<jsp:useBean id="prod" class="com.Product" scope="request"/>
	
	<table border="1">

		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Price</th>
		</tr>


		<tr>
			<td>${prod.prodId}</td>
			<td>${prod.myproductname}</td>
			<td>${prod.price}</td>

		</tr>



	</table>








</body>
</html>