<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<c:out value="Welcome to JSTL"/>
<c:set var="age" value="10" scope="request"/>
<c:set var="ename" value="Praveen"/>
<h2>Age is ${requestScope.age}  </h2>
<h2>Name is ${ename}</h2>
<h2>Age is <c:out value="${requestScope.age}"/> </h2>
<hr/>
<c:if test="${param.age >=18 }">
	Dear ${ename} Welcome as your age is ${param.age}
</c:if>

<c:if test="${param.age <18 }">
	Dear ${ename} Not Selected as your age is ${param.age}
</c:if>





