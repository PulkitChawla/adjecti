<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css"/> 
</head>
<body>
	<center><b>Online Exam</b></center>
	<br><br>
	<ul>
	<li class="active"><a href="index.jsp" >Home</a></li>
	<li><a href="addExam.jsp"><span id="add">AddExam</a></span></li>
	 <li><a href="searchExamById.jsp"><span id="search">SearchExam</a></span></li>
	 <li><a href="editExam.jsp"><span id="edit">EditExam</a></span></li>
	 <li><a href="showExam.jsp"><span id="disp">DisplayExam</a></span></li><!-- viewExam.do -->
	 <li><a href="deleteById.jsp" ><span id="del">DeleteExamById</a></span></li>
	 </ul>
	
      <script>
      var navId="${param.select}";
      var nav=document.getElementById(navId);
      nav.style.color="red";
      
      </script>
</body>
</html> 