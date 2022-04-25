<%@page import="exam.pojo.Exam"%>
<%@page import="java.util.List"%>
<%@page import="exam.dao.ExamDao"%>
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
<style>
th{
font-size:20px;
color:blue;
cell-spacing:5px;
padding:5px;
margin:3px;
}

td{
font-size:20px;
cell-spacing:5px;
line-height:30px;
padding:5px;
text-align:center;
}
</style>
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
<table class="m-4 p-4" border="1" cellpadding="15" cellspacing="10" style="height:auto; margin:5px;padding:5px;" >
       <tr >
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
    

    <a href="addExam.jsp" style="color:orange;margin-right:20px; font-size:15px" >Add Exam</a>
	<a href="index.jsp" style="color:orange;margin-right:20px; font-size:15px">Main Page</a> 
	</center>
	<%@ include file="footer.jsp" %>
</body>
</html>