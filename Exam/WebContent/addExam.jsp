<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
</body>
</html>