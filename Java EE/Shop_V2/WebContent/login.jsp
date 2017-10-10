<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2 align="center">Login Form</h2> <hr width="50%"/>
<br>

<form  action="prodController?menu=login" method="post" >
	<table  align="center" cellpadding="5" align="center" cellspacing="5">
		<tr>
			<td>User Id</td>
			<td><input type="text" name="userName">
		</tr>
		
		<tr>
			<td>Password</td>
			<td><input type="password" name="password"></td>
		</tr>
		
		<tr>
			<th colspan="2">
				${param.msg}
			</th>
		</tr>
		<tr>
			<th colspan="2">
				<input type="submit" value="Login">
				<input type="reset" value="Clear All">
			</th>
		</tr>
	
	
	</table>

</form>
<hr width="50%"/>

</body>
</html>