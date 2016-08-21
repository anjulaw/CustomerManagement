<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="customer.*"%>
<%-- retrieve the CustomerBean object using requestScope --%>
<c:set var="customer" value="${requestScope.customer}"/>
<html>
<head>
<title>Display Customer</title>
</head>
<body>
<table cellspacing="3" cellpadding="3" border="1" width="500">
<tr>
<td colspan="2"><b>Customer:</b>
${customer.firstName}
${customer.lastName}</td></tr>
<tr>
<td><b>Customer Id</b>
<td>${customer.cusId}
<tr>
<td><b>First Name</b>
<td>${customer.firstName}
<tr>
<td><b>Last Name</b>
<td>${customer.lastName}
<tr>
<td><b>Address</b>
<td>${customer.address}
</table>
</body>
</html>