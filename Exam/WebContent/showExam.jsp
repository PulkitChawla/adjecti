<%@page import="exam.pojo.Exam"%>
<%@page import="java.util.List"%>
<%@page import="exam.dao.ExamDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>Exam ID</th>
          <th>Exam Name</th>
          <th>Exam Description</th>
          <th>Edit</th>
          <th>Delete</th>
       </tr>
       <%
       	ExamDao dao=new ExamDao();
       List<Exam> exam=dao.getAllExams();
       for(Exam e:exam){
       %>
       
          <tr>
             <td><%=e.getExamId() %></td>
             <td><%=e.getExamName() %></td>
             <td><%=e.getExamDesc() %></td>
             <td>
                <a href="editExam.jsp?code=<%=e.getExamId()%>">Edit</a>
             </td>
             <td>
                <a href="deleteById.jsp?code=${exam.eid}">Delete</a>
             </td>
          </tr>
      
       <%
       }
       %>
    </table>

    <a href="addExam.jsp" >Add Exam</a>
	<a href="index.jsp">Main Page</a> 
	
</body>
</html>