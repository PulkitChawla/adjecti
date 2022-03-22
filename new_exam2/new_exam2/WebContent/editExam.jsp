<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>EditForm</title>
</head>
<body>
<%@ include file="navbar.jsp" %>
<c:set var="examlistobj" value='${requestScope["editExam"]}' />
<div class="container bg-light" style="margin-top: 50px;">
		<h3 class="text-center " style="margin-top: 10px; padding:10px; text-shadow: 3px 6px 5px #000000">Edit Exam Details</h3>
		<form action="Updateform.do" method="post">
			<table class="table">

				<tr>
					<td>Exam Id :</td>
					<td>
					<input  class="form-control" name="eid" value="${examlistobj.id}"></td>
				</tr>
				<tr>
					<td>Exam Name :</td>
					<td><input type="text" class="form-control" name="ename"
						value="${examlistobj.ename}"></td>
				</tr>
				<tr>
					<td>Held By :</td>
					<td><input type="text" class="form-control" name="heldBy"
						value="${examlistobj.heldBy}"></td>
				</tr>
				
				<tr>
					<td>State :</td>
					<td><input type="text" class="form-control" name="state"
						value="${examlistobj.state}"></td>
				</tr>

			</table>


			<button type="submit" class="btn btn-secondary"
				style="margin-left: 35%; margin-bottom: 15px;">Update</button>
			<a href="DisplayServlet" class="btn btn-secondary" style="margin-bottom: 15px;">Back</a>
		</form>
	</div>

</body>
</html>