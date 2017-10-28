<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="saveEmp.htm" commandName="bla">
Emp Id:  <form:input path="empId" /> <br>
Emp Name:<form:input path="empName"/> <br>
Salary: :<form:input path="salary"/> <br>
Select a City: 

<form:select path="cityName">
	<form:options items="${cities}"/>

</form:select> <br>
<form:radiobuttons path="cityName" items="${cities}"/><br>
<form:checkboxes items="${cities}" path="cityName"/>





</form:form>


</body>
</html>