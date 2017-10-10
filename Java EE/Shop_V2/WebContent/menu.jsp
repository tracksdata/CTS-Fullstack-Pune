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
<%
response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");
%>
<c:if test="${sessionScope.user eq null }">
<jsp:forward page="login.jsp?msg=Illegal Access. Login Again"/>
</c:if>
<center>
<a href="index.jsp">Home</a>|
<a href="addproduct.jsp">Add</a> | 
<a href="search.jsp">Search</a> |
<a href="prodController?menu=findList">Search-V1</a> | 
<a href="prodController?menu=listAll">Display</a> | 
<a href="update.jsp">Update</a> | 
<a href="delete.jsp">Delete</a> |
<a href="prodController?menu=logout">Logout</a> 
</center>
</body>
</html>