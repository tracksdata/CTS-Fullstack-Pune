<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href=".\node_modules\bootstrap\dist\css\bootstrap.css">
<link rel="stylesheet" type="text/css" href=".\css\style.css">
<script type="text/javascript">
	function validateData(elementName) {

	}
</script>
</head>
<body class="container">
	<br />


	<div class="wrapper">
		<form class="form-signin" action="validateUser.htm" method="post">
			<h2 class="form-signin-heading">Please login</h2>

			<div class="input-group">
				<span class="input-group-addon"> <i
					class="glyphicon glyphicon-user"></i></span> <input type="text"
					class="form-control" name="userName" placeholder="Login Id"
					required="" autofocus="" />
			</div>
			<br/>
			<div class="input-group">
				<span class="input-group-addon"> <i
					class="glyphicon glyphicon-lock"></i>
				</span> <input id="password" type="password" class="form-control"
					name="password" placeholder="Password">
			</div>
			
			<br/>

			<div class="form-group">

				<input type="checkbox" value="remember-me" id="rememberMe" class="form-controll"
					name="rememberMe"> Remember me </label>
			</div>

			<div align="center"><b>${message}</b></div>

			<div class="form-group">
				<button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
			</div>
		</form>
	</div>
</body>
</html>