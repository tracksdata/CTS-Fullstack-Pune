<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}\node_modules\bootstrap\dist\css\bootstrap.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="./node_modules/bootstrap/dist//js/bootstrap.min.js"></script>

<style>
.mobile-margin-btn {
	margin-left: 15px;
}
</style>
</head>
<body class="container">
	<br>
	${pageContext.request.contextPath}
	<div class="well">
		<h2 align="center">Welcome to Product Application</h2>
	</div>


	<nav class="navbar navbar-inverse">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" data-target="#navbarCollapse"
				data-toggle="collapse" class="navbar-toggle">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a href="#" class="navbar-brand">Home</a>
		</div>
		<!-- Collection of nav links, forms, and other content for toggling -->
		<div id="navbarCollapse" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Add Product</a></li>
				<li class="active"><a href="#">Find Product</a></li>
				<li class="active"><a href="#">Display Products</a></li>
				<li class="active"><a href="#">Update Product</a></li>
				<li class="active"><a href="#">Delete Product</a></li>
				<li class="dropdown"><a data-toggle="dropdown"
					class="dropdown-toggle" href="#">Account<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">Profile</a></li>
						<li><a href="#">Change Password</a></li>
						<li><a href="#">Update Profile</a></li>
						<li class="divider"></li>
						<li><a href="#">Delete Account</a></li>
					</ul></li>
			</ul>
			<form class="navbar-form navbar-left">
				<div class="input-group">
					<input type="text" class="form-control" placeholder="Search">
					<span class="input-group-btn">
						<button type="button" class="btn btn-default">
							<span class="glyphicon glyphicon-search"></span>
						</button>
					</span>
				</div>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="logout.htm">Logout</a></li>
			</ul>
		</div>
	</nav>
	<hr />
	Welcome dear ${sessionScope.login.userName}
</body>
</html>