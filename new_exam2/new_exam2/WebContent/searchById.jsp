
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Exam By Id</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>
<!-- 1 using JSP -->
<%-- <%String currentPage="searchById"; %>
	<%@ include file="navbar.jsp" %> --%>
		<!-- OR -->
	<jsp:include page="navbar.jsp">
	<jsp:param value="searchById" name="current"/>
	</jsp:include>

<!-- 2 using JSTL -->


	<div class="form-inline active-cyan col-sm-7"
		style="margin: 10px 35px;">
		<form action="search-by-id.do" method="post">
			<input name="searchId" style="width: 400px;" class="form-control"
				type="text" placeholder="Search here with exam Id"
				aria-label="Search">
			<button name="searchId" class="btn btn-secondary fa fa-search">Search</button>
		</form>
	</div>


<!-- 	<h3 style="margin-top: 50px; text-align: center;">----------Search
		Exam Detail By Id--------------</h3> -->
	<div class="container-fluid">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Exam Id</th>
					<th scope="col">Exam Name</th>
					<th scope="col">Held By</th>
					<th scope="col">State</th>

				</tr>
			</thead>
			<tbody>
				<c:set var="elist" value='${requestScope["examlist"]}' />
				<c:if test="${elist != null}"></c:if>
				<tr>
					<td><c:out value="${elist.id}"></c:out></td>
					<td><c:out value="${elist.ename}"></c:out></td>
					<td><c:out value="${elist.heldBy}"></c:out></td>
					<td><c:out value="${elist.state}"></c:out></td>
				</tr>

			</tbody>
		</table>
	</div>

</body>
</html>