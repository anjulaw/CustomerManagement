<%-- retrieve the CustomerBean object using request.getAttribute --%>
<%@ page import="customer.CustomerBean" %>
<% CustomerBean customer=(CustomerBean) request.getAttribute("customer");%>
<html>
<head>
<title>Display Customer</title>
</head>
<body>
<table cellspacing="3" cellpadding="3" border="1" width="200">
<%
if(customer!=null)
{
%>
<tr>
<td colspan="2"><b>Customer:</b>
<%=customer.getFirstName()%>
<%=customer.getLastName()%>
<tr>
<td><b>Customer Id</b>
<td><%=customer.getCusId()%>
<tr>
<td><b>First Name</b>
<td><%=customer.getFirstName()%>
<tr>
<td><b>Last Name</b>
<td><%=customer.getLastName()%>
<tr>
<td><b>Address</b>
<td><%=customer.getAddress()%>
</table>
<%
}
else
{
out.print("<h1>Customer id does not exist</h1>");
}
%>
</body>
</html>