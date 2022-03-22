<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
       
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="navbar.jsp">
	<jsp:param value="index" name="current"/>
	</jsp:include>
	<div id="slide" class="carousel slide" data-ride="carousel">
		<ul class="carousel-indicators">
			<li data-target="#slide" data-slide-to="0" class="active"></li>
			<li data-target="#slide" data-slide-to="1"></li>

		</ul>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="adjecti_site.png" alt="Los Angeles" width="1520" height="550"
					style="opacity: 0.5;">
				<div class="carousel-caption zoom"
					style="text-align: center; margin-bottom: 200px; color: #000; font-size: 30px;">
					<h3>Welcome to our</h3>
					<p>Exam Portal</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="exam_center.jfif" alt="Chicago" width="1520" height="550">
				<div class="carousel-caption zoom"
					style="text-align: center; color: #000; font-size: 40px;">
					<h3>Held By</h3>
					<p>Adjecti India</p>
				</div>
			</div>

		</div>
	</div>
</body>
</html>