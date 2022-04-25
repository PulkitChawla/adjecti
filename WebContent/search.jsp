<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

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
<center>
<form action="searchById.do"  method="post">
Enter ID<input type="text" name="eid">
<input type="submit" value="Search">

</form>
</center>
<%@ include file="footer.jsp" %>
</body>
</html>