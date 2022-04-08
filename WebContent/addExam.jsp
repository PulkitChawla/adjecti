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
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");

if(session.getAttribute("current_user")==null){
	response.sendRedirect("login.jsp");
}
%>
<%@include file ="header.jsp"%>
<center class="border border 2px solid" >
<form action="addExam.do" id="addform" method="post" target="_blank">
			<label>Exam ID:</label> <input type="text" name="eid">
			<br> <br> 
			<label>Exam Name:</label> <input type="text" name="ename">
			<br> <br> 
			<label>Exam Description:</label> <input type="text" name="edesc"> 
			<br> <br> 
			<input type="submit" formmethod="post" value="Submit">
			<input type="reset" value="Reset">
			<a href="index.jsp">Main Page</a> 
			
</form>
</center>
<%@include file="footer.jsp" %>
</body>
</html>
