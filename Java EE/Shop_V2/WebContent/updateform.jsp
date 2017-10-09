<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Product Update Form</h1> <hr/>
<jsp:include page="/menu.jsp"/>
<br>

<form action="prodController?menu=update1" method="post">
	<table align="center" cellpadding="5" cellspacing="5">
	
		<tr>
			<td>Product Id</td>
			<td><input type="text" name="prodId" value="${product.prodId}" readonly="readonly"></td>
		</tr>	
		
		<tr>
			<td>Product Name</td>
			<td><input type="text" name="prodName" value="${product.prodName}"> </td>
		</tr>	
			
		<tr>	
			<td>Price</td>
			<td><input type="text" name="price" value="${product.price}"> </td>
		</tr>	
	
	
		<tr>
			<th  colspan="2">
				<input type="submit" value="Update">
				<input type="reset" value="Clear All">
			</th>
		</tr>
	
	</table>



</form>


</body>
</html>