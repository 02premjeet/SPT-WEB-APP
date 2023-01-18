<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create bill</title>
</head>
<body>
<h2>create new lead</h2>
      <form action="saveBill" method="post" >
      <pre>
      
      
      FirstName:<input type="text" name="firstName" value="${contact.firstName}"/>
      LastName:<input type="text" name="lastName" value="${contact.lastName}"/>
      Email:<input type="text" name="email" value="${contact.email}"/>
      Mobile:<input type="text" name="mobile" value="${contact.mobile}"/>
     product:<input type="text" name="product"/>
     Amount:<input type="text" name="amount"/>
<input type="submit" value="generate bill">
      </pre>
      </form>

</body>
</html>