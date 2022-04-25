<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Login Form</title>
</head>
<body>
<%
if(session.getAttribute("current_user")!=null){
	response.sendRedirect("index.jsp");
}
%>
<%@include file ="header.jsp"%>


<form action="loginServlet" method="post">
<center>Login Form<br><br>
Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="userId" placeholder="Enter email"><br><br>
Password<input type="text" name="pwd" placeholder="Enter password"><br><br>
<input type="submit" value="login"></center>
</form>
<%@include file="footer.jsp" %>
</body>
</html>