<%@page import="exam.dao.ExamDao,exam.pojo.Exam"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<%
		int code = Integer.parseInt(request.getParameter("code"));
		ExamDao dao = new ExamDao();
		Exam exam = dao.searchById(code);
	%>
	<form method="post" action="updateExam.do">

		<table border="0">
			<tr>
				<td>Exam ID</td>
				<td><input type="number" readonly="readonly" name="eid"
					value="<%=exam.getExamId()%>" /></td>
			</tr>
			<tr>
				<td>Exam Name</td>
				<td><input type="text" name="ename"
					value="<%=exam.getExamName()%>" /></td>
			</tr>
			<tr>
				<td>Exam Description</td>
				<td><input type="text" name="edesc"
					value="<%=exam.getExamDesc()%>" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /> <a
					href="${pageContext.request.contextPath}/showExam">Cancel</a></td>
			</tr>
		</table>
	</form>
	<%@ include file="footer.jsp" %>
</body>
</html>