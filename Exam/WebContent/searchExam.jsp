<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="exam.pojo.Exam"%>
<%@page import="java.util.List"%>
<%@page import="exam.dao.ExamDao"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Search Exam</h1>
	<table border="1">
		<tr>
			<td>Exam Id</td>
			<td>Exam Name</td>
			<td>Exam Description</td>
		</tr>
		<c:set var="exam1" value='${requestScope["examlist"]}'></c:set>



		<tr>
			<td><c:out value="${exam1.examId}"></c:out></td>
			<td><c:out value="${exam1.examName}"></c:out></td>
			<td><c:out value="${exam1.examDesc}"></c:out></td>

		</tr>

	</table>
</body>
</html>