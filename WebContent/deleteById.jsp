<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");

if(session.getAttribute("current_user")==null){
	response.sendRedirect("login.jsp");
}
%>
<%@ include file="header.jsp" %>

<form action="deleteExam.do" method="post">
Enter Exam Id:<input type="number"  id="id" placeholder="Enter id" name="eid">
      <label><input type="checkbox" value="checked" name="remember"> Remember me</label>
      <button type="submit" class="btn btn-default">Delete Exam</button> 
</form>
<%@ include file="footer.jsp" %>

</body>
</html>