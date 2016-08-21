<html>
<body>
<h3>View Customer Details</h3>
<p>
<form action="../servlet/SimpleController" method="post">
Enter Customer ID:
<input type="text" name="cusId">
<br>
<!-- pass the action as a hidden variable -->
<input type="hidden" name="action" value="displaycustomer">
<input type="submit" value="Display">
</form>
<p>
<!-- pass the action as a query string -->
<a href="../servlet/SimpleController?action=displaylist" target="_self">
View Full List of Customers</a>
</body>
</html>