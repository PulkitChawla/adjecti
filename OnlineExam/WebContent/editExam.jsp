<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="exam.*" %><%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
  String id = request.getParameter("id");
  int id3 = Integer.parseInt(id);
  System.out.println(id3);
 
  ExamStoreImpl examstore = new ExamStoreImpl();
  Exam exam = examstore.searchById(id3);
 
  
  	%>
  	<c:set var="exam" value='${requestScope["showList"]}'>
  <h2>Edit Exam Form</h2>
  <form action="edit.do" method="post"><!-- edit -->
   Enter Id:<input type="hidden" placeholder="Enter id" name="id" value='$exam.getId'>
   Enter Name:<input type="text" placeholder="Enter Name" name="name" value=" <%= exam.getName()%>">
   Enter Description:<input type="text" placeholder="Enter Description" name="descr" value="<%= exam.getDesc()%>">
    <button type="submit">Update</button>
  </form> 
  </c:set>
</body>
</html>