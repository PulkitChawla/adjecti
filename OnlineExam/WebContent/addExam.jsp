<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"> 
<jsp:param value="add" name="select"/>
</jsp:include>
	<form action="addExam.do" id="addform" method="post" target="_blank">
			<label>Exam ID:</label> <input type="text" name="id">
			<br> <br> 
			<label>Exam name:</label> <input type="text" name="name">
			<br> <br> 
			<label>Exam Description:</label> <input type="text" name="desc"> 
			<br> <br> 
			<input type="submit" formmethod="post" value="Submit">
			<input type="reset" value="Reset"> 
			
		</form>

</body>
</html>