<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<form action="deleteExam.do" method="post">
Enter Exam Id:<input type="number"  id="id" placeholder="Enter id" name="eid">
      <label><input type="checkbox" value="checked" name="remember"> Remember me</label>
      <button type="submit" class="btn btn-default">Delete Exam</button> 
</form>
</body>
</html>