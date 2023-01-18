<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container" align="center">

	<h2>All Leads</h2>
	<table border="1">
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>email</th>
			<th>Mobile</th>
			<th>Source</th>
			<th>Billing</th>
			
		</tr>
		<c:forEach var="lead" items="${contacts}">
		 <tr>
		<td><a href="leadInfo?id=${lead.id}">${lead.firstName}</a></td>
		<td>${lead.lastName}</td>
		<td>${lead.email}</td>
		<td>${lead.mobile}</td>
		<td>${lead.source}</td>
		<td><a href="generateBill?id=${lead.id}">billing</a></td>
		
		
		</c:forEach>
	</table>
</div>
</body>
</html>