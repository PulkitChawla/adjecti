<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.first.Employee"%>
<%@page import="com.first.EmployeeInMemoryStore"%>
<%@page import="com.first.EmployeeStore"%>
<%@page import="com.first.EmpController" %>
<html>
<head>
  <title>SearchEmployee</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
  <h4>Enter Employee Id </h4>
  <form action="Search1" method="post">
  Enter Id:<input type="number" placeholder="Enter id" name="id">
<input type="submit" value="search"> 
</form>
</html>

 