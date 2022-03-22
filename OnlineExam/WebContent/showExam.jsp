<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="error.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Page</title>
</head>
<body>
<jsp:include page="header.jsp"> 
<jsp:param value="disp" name="select"/>
</jsp:include>
<form action="viewExam.do" method="get">
	<table  border="1" cellspacing="0" align="left" width="100%">
	<thead>
         <tr>
            <th>ExamId</th>
            <th>ExamName</th>
            <th>ExamDescription</th>
          </tr>   
   </thead>
  
	<c:set var="exam" value='${requestScope["showList"]}'></c:set>
	
	
	<c:forEach items="${exam}" var="exam1">
	<tr>
	
          <td><c:out value="${exam1.id}"></c:out></td>
          <td><c:out value="${exam1.name}"></c:out></td>
          <td><c:out value="${exam1.desc}"></c:out></td> 
        
    </tr>
    </c:forEach>
	</table>
	</form>
</body>
</html>