<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Add Product</h2>

	<jsp:include page="menu.jsp" />
	<form
		action="${pageContext.request.contextPath }/prodController?menu=save"
		method="post">

		<hr />


		<table align="center">

			<tr>
				<td>Product Id</td>
				<td><input type="text" name="prodId" required=true></td>

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
				<th colspan="2">${msg}</th>
			</tr>

			<tr>
				<th colspan="2"><input type="submit" value="Save"> <input
					type="reset" value="Clear All"></th>
			</tr>

		</table>
	</form>
	<hr />

	<c:if test="${sessionScope.cart ne null}">

		<table align="center" cellpadding="5" cellspacing="5">
			<tr bgcolor=silver>
				<th>Sno</th>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Price</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>

			<c:forEach items="${sessionScope.cart}" var="prod" varStatus="pc">
				<tr>
					<td>${pc.count}</td>
					<td>${prod.prodId}</td>
					<td>${prod.prodName}</td>
					<td>${prod.price }</td>
					<td><a href="${pageContext.request.contextPath}/prodController?menu=update&prodId=${prod.prodId}">Update</a></td>
					<td><a href="${pageContext.request.contextPath}/prodController?menu=delete&prodId=${prod.prodId}">Delete</a></td>
				</tr>
			</c:forEach>

		</table>

	</c:if>
</body></html>