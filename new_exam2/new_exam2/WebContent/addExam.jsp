<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page errorPage="error.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddExamDetail</title>
<link rel="stylesheet" href="CSS/addExam.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js"></script>


</head>
<body>
<!-- 1 using JSP -->
<%-- 	<%String currentPage="addExam"; %>
	<%@ include file="navbar.jsp"%> --%>
				<!-- OR -->

	<jsp:include page="navbar.jsp">
	<jsp:param value="addExam" name="current"/>
	</jsp:include>
	
<!--2  -->

<!--3  -->
<!-- <script type="text/javascript">
var current="addExam";
</script> -->


	<div class="container">
		<div class="form-contain">
			<div class="formBox">
				<form action="addexam.do" method="post">

					<h2 class="text-center font-weight-bold" style="font-size: 40px">Enter
						Exam Details</h2>

					
					<div class="inputBox">
						<input type="text" required="required" placeholder="Enter exam name" name="ename">
						
					</div>

					<div class="inputBox">
						<input type="text" required="required" placeholder="Enter conducted by" name="heldBy">
						
					</div>
					<div class="inputBox">
						<input type="text" required="required" placeholder="Enter State" name="state">
						
					</div>
					<button type="submit" class="btn">Submit</button>
					<button type="reset" class="btn">Clear</button>
				</form>
			</div>
		</div>
	</div>

	
</body>
</html>

