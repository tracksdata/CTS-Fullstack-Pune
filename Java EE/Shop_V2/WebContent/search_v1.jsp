<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Products from database</h1> <hr/>
<jsp:include page="/menu.jsp"/>
<br>
<form action="prodController?menu=search" method="post">
<table border="1" align="center">

	<tr bgcolor="skyblue">
		
		<th>Product Id:</th>
		
		<td>
		<select name="prodId">
	
	<c:forEach varStatus="pc" items="${prods}" var="prod">
	
		
		
		<option>${prod.prodId} </option>
		
		
	
	</c:forEach>
	
	</select>
	 </td>
</tr>

<tr>

	<th colspan="2">
		<input type="submit" value="Search">
	</th>
</tr>

</table>
</form>

</body>
</html>