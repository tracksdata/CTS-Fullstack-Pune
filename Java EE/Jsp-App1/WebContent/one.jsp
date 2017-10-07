<%@page import="java.util.*,java.io.*,java.awt.*" %>
<%@page import="java.text.*"%>
<h1>Welcome to Jsp Page</h1>
<h2>This is Second heading</h2>
<button>CLick Here</button>

<%!

static class MyInner{
	
}
String ename="Ozvitha";
public String getMsg(){
	
	return "Break Time";
}
%>
<h2>Date : <%=new Date() %> </h2>
<h1>Ename: <%=ename%></h1>
<h1>Method Data:<%=getMsg()%> </h1>

<%
  	 String s1="Praveen";
	 out.println("<h1>Hello .... "+s1);
	request.setAttribute("user", "Admin");
%>

<h2>Your Name is <%=s1%> </h2> 
<h2>data in request is <%=request.getAttribute("user") %> </h2>


