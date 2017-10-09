<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="/menu.jsp"/><br/>
<form action="prodController?menu=save" method="post">

<h2 align="center">Welcome to Product Management</h2> <hr/>
<table align="center">

	<tr>
		<td>Product Id</td>
		<td><input type="text" name="prodId"></td>
		
	</tr>
	
	
	<tr>
		<td>Product Name</td>
		<td><input type="text" name="prodName"></td>
		
	</tr>
	
	<tr>
		<td>Price</td>
		<td><input type="text" name="price"></td>
	</tr>
	
	<tr>
		<th colspan="2">
			${msg}
		</th>
	</tr>
	
	<tr>
		<th colspan="2">
			<input type="submit" value="Save">
			<input type="reset" value="Clear All">
		</th>
	</tr>

</table>


</form>

<hr/>
</body>
</html>