<%@ page import="com.adj.oexam.Exam"%>
<%@ page import="com.adj.oexam.ExamRepository"%>
<%@ page import="com.adj.oexam.AllExams"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page errorPage="error.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DisplayList</title>
<link href="CSS/navbar.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
</head>
<body>
	
	<!--1  -->
	<%-- <%String currentPage="viewExam"; %>
	<%@ include file="navbar.jsp"%> --%>
		<!-- OR -->
	<jsp:include page="navbar.jsp">
	<jsp:param value="viewExam" name="current"/>
	</jsp:include>
	
	<!--2 using JSTL -->
	
	<h2
		style="text-align: center; color: grey; text-shadow: 2px 2px 4px #000000; margin-top: 20px;">Exams
		List</h2>
	<hr>
	<div class="container-fluid">
		<table class="table" >
			<thead class="thead-dark">
				<tr class="current">
					<th scope="col">Exam Id</th>
					<th scope="col">Exam Name</th>
					<th scope="col">Held By</th>
					<th scope="col">State</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:set var="eList" value='${requestScope["examlist"]}' />
				<c:forEach items="${eList}" var="eobj">

					<tr>
						<td>${eobj.id}</td>
						<td><a href='UpdateServlet.do?id=${eobj.id }'
							class="text-dark"> <c:out value="${eobj.ename}"></c:out></a></td>
						<td><c:out value="${eobj.heldBy}"></c:out></td>
						<td><c:out value="${eobj.state}"></c:out></td>
						<td>
							<button class="fa fa-close " data-toggle="modal"
								style="transition: all .08s linear; outline: medium none; -moz-outline-style: none; border: 0px; box-shadow: 0 0 0 1px #ebebeb inset, 0 0 0 2px rgba(255, 255, 255, 0.15) inset, 0 8px 0 0 #adadad, 0 8px 0 1px rgba(0, 0, 0, 0.4), 0 8px 8px 1px rgba(0, 0, 0, 0.5);"
								data-target="#data" onclick=" showModal(${eobj.id})"></button>


						</td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>

	<div class="modal fade" id="data">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Delete Exam
						details</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">Really want to delete??</div>
				<form action="delete-by-id.do" method="get" id="delete-data">
					Id:<input class="form-contro" name="id">
					<div class="modal-footer">
						<button type="submit" class="btn btn-secondary">Yes</button>
						<button type="button" class="btn btn-dark" data-dismiss="modal">No</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- JavaScript -->
	<script>
		function showModal(id){
			document.getElementById("delete-data").id.value=id;
			$("#data").modal("show");

			}
</script>

</body>
</html>