<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<h1>Welcome to My Application</h1>

<table border="1">

	<tr bgcolor="skyblue">
		<th>Sno</th>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Price</th>
	</tr>


	<c:forEach varStatus="pc" items="${products}" var="prod">
	
		<tr>
			<td>${pc.count}</td>
			<td> ${prod.prodId}</td>
			<td> ${prod.prodName}</td>
			<td> ${prod.price}</td>
		</tr>
	
	</c:forEach>


</table>







<c:forEach var="i" begin="1" end="10" step="1">
<li> ${i} </li>
</c:forEach>
<hr/>

<c:forEach var="country" items="${requestScope.myCountries}" varStatus="cnt">
 ${cnt.count}  ${country } <br>
</c:forEach>


<hr/>

<c:forEach var="friend" items="${requestScope.myFriends}" varStatus="cnt">
 ${cnt.count}  ${friend } <br>
</c:forEach>


<h2> Request: ${userName}</h2>
<h2> Session: ${sessionScope.userName}</h2>

<h3>Product Id: ${product.prodId}</h3>
<h3>Product Name: ${product.prodName}</h3>
<h3>Price: ${product.price}</h3>
<hr/>





