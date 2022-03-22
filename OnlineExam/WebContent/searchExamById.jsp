<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="exam.*"%>
<%@ page errorPage="error.jsp" %>
<html>
<head>
  <title>SearchEmployeeById</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<jsp:include page="header.jsp">
<jsp:param value="search" name="select"/>
</jsp:include>
  <h4>Enter Exam Id </h4>
  <form action="search.do" method="post">
  Enter Id:<input type="number" placeholder="Enter id" name="id">
<input type="submit" value="search"> 
</form>
</html>