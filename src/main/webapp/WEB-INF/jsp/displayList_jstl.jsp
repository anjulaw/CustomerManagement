<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="customer.*"%>
<html>
<head>
<title>Display Customer List</title>
</head>
<body>
<table cellspacing="3" cellpadding="3" border="1" width="500">
<tr>
<td colspan="4"><b>Customer List</b>
<tr>
<td><b>Id</b>
<td><b>First Name</b>
<td><b>Last Name</b>
<td><b>Address</b>
<c:forEach var="cust" items="${requestScope.customers}">
<tr>
<td>${cust.address}
<td>${cust.cusId}
<td>${cust.firstName}
<td>${cust.lastName}
</c:forEach>
</table>
</body>
</html>