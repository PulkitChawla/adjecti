<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	

	<nav class="navbar">
		<!-- LOGO -->
		<div class="logo "><a href="index.jsp ">Online Exam</a></div>
		<!-- NAVIGATION MENU -->
		<ul class="nav-links">
			<!-- USING CHECKBOX HACK -->
			<!-- <input type="checkbox" id="checkbox_toggle" />
			<label for="checkbox_toggle" class="hamburger">&#9776;</label> -->
			<!-- NAVIGATION MENUS -->
			<div class="menu">
			
				<li><a href="index.jsp">Home</a></li>
				<li><a href="add-page.do">Add Exam</a></li>
				<li><a href="search.jsp">Search Exam</a></li>
				<li><a href="showExam.do">Show Exam</a></li>
				
				<!-- <li class="services"><a href="/">Services</a> DROPDOWN MENU
					<ul class="dropdown">
						<li><a href="/">Dropdown 1 </a></li>
						<li><a href="/">Dropdown 2</a></li>
					</ul></li> -->
				
			</div>
		</ul>
		<%
				if (session.getAttribute("current_user") == null) {
				%>

				<!-- <a class="nav-link btn btn-light ms-2 text-dark pulkit" href="login.jsp">Login</a> -->
				<a class="nav-link btn btn-secondary ms-2 text-dark pulkit" href="login.jsp">Login</a>
				<%
				} else {
				%>
				<a class="nav-link   ms-2 pulkit text-white " href="#"><i class="bi bi-person-check ">${current_user.getName()}</i></a>
				<a class="nav-link btn btn-danger ms-2 text-dark pulkit" href="logout.jsp">Logout</a>
				<%
				}
				%>
		<!-- <a class="logout" href="logout.jsp" style="float: right; color:white;">Logout</a> -->
	</nav>
	
</body>
</html>