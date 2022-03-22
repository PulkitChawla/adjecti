
<%-- <jsp:include page="addExam.jsp" %> --%>
<link href="CSS/navbar.css" rel="stylesheet">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header>
	<h3>Online Exam</h3>
	<%String currentPage=request.getParameter("current"); %> 
	<nav>
		<ul class="nav">	
			<li><a class="current" href="index.do" id="index">Home</a></li>
			<li><a class="current" href="addExam.do" id="addExam">AddExam</a></li>
			<li><a class="current" href="viewExam.do" id="viewExam">ViewExams</a></li>
			<li><a class="current" href="searchById.do" id="searchById">SearchById</a></li>
			<li><a class="current" href="searchByName.do" id="searchByName">SearchByName</a></li> 
		</ul>
	</nav>
	<script>
	var r="<%=currentPage%>";
	var currPage = document.getElementById(r);
	currPage.style.color='black';
	</script>
</header>