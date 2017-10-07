<h1>Demo.jsp</h1> <hr/>
<%
String s1="Praveen";
// session.setAttribute("name", "Session-Praveen");
// request.setAttribute("name", "Request-Praveen");

application.setAttribute("name", "Context-Praveen");
%>

${100+200} <br>
${1000 >200} <br>


<h2>Name: ${name}</h2>