<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/menu.jsp"/> <br/>
<h1 align="center">Product Search Form</h1> <hr/>
	<form action="prodController?menu=search" method="post">
		<table align="center" cellpadding="5" cellspacing="5">

			<tr>
				<th>Product ID</th>
				<td><input type="text" name="prodId">
			</tr>

			<tr>
				<th colspan="2">
					${msg}
				</th>
			</tr>

			<tr>
				<th colspan="2"><input type="submit" value="Search"> 
				<input type="reset" value="Clear All"></th>
			</tr>


		</table>
	</form>





</body>
</html>