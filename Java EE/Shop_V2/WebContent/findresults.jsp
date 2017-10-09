<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Product Data</h1> <hr/>
<jsp:include page="/menu.jsp"/>
<br>
<table border="1" align="center">

	<tr bgcolor="skyblue">
		
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Price</th>
	</tr>
	
		<tr>
			
			<td> ${product.prodId}</td>
			<td> ${product.prodName}</td>
			<td> ${product.price}</td>
		</tr>
	



</table>




</body>
</html>