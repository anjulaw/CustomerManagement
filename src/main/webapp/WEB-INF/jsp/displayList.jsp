<%@ page import="java.util.*"%>
<%@ page import="customer.*"%>
<html>
<head>
<title>Display Customer List</title>
</head>
<body>
<table cellspacing="3" cellpadding="3" border="1" width="400">
<tr>
<td colspan="4"><b>Customer List</b
<tr>
<td><b>Id</b>
<td><b>First Name</b>
<td><b>Last Name</b>
<td><b>Address</b>
<tr>
<%
List cusList=(List)request.getAttribute("customers");
/* An Iterator object is required to go through the List*/
Iterator cusListIterator=cusList.iterator();
CustomerBean customer;
while(cusListIterator.hasNext())
{
customer=(CustomerBean)cusListIterator.next();
%>
<tr>
<td><%=customer.getCusId()%>
<td><%=customer.getFirstName()%>
<td><%=customer.getLastName()%>
<td><%=customer.getAddress()%>
<%
}
%>
</table>
</body>
</html>