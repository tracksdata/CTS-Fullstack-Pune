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
<%
response.setIntHeader("Refresh", 61);
%>
<c:if test="${sessionScope.user eq null }">
<jsp:forward page="login.jsp?msg=Illegal Access. Login Again"/>
</c:if>

<h1 align="center">Product Management Application</h1> <hr/>
<h2>Welcome dear ${sessionScope.user }</h2>

<jsp:include page="/menu.jsp"/>



</body>

</html>