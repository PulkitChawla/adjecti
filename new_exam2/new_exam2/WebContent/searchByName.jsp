<%@ page errorPage="error.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SearchByName</title>
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
<%-- <%String currentPage="searchByName"; %>
<%@ include file="navbar.jsp"%> --%>
			<!-- OR -->
	<jsp:include page="navbar.jsp">
	<jsp:param value="searchByName" name="current"/>
	</jsp:include>
	
	<!-- 2 using JSTL -->
	
<!-- Search form -->
	<div class="form-inline active-cyan col-sm-7"
		style="margin: 10px 35px;">
		<form action="search-by-name.do" method="post">
			<input name="SearchName" style="width: 400px;"
				type="text" placeholder="Search here with exam name"
				aria-label="Search">
			<button name="searchId" class="btn btn-secondary fa fa-search">Search</button>
		</form>
	</div>
	<!-- 
	
			<h3 style="margin-top: 50px; text-align: center;">----------Search
				Exam Detail By Name--------------</h3> -->
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
				<c:set var="examList" value='${requestScope["examlist"]}' />
				<c:if test="${examList != null}">
					<c:forEach items="${examList}" var="detail">
					<tr>
						<td><c:out value="${detail.id}"></c:out></td>
						<td><c:out value="${detail.ename}"></c:out></td>
						<td><c:out value="${detail.heldBy}"></c:out></td>
						<td><c:out value="${detail.state}"></c:out></td>
					</tr>
					</c:forEach>

				</c:if>
			</table>

	</div>	
</body>
</html>