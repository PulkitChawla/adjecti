<%@page import="java.util.List"%>
<%@page import="com.first.Employee"%>
<%@page import="com.first.EmployeeStore"%>
<%@page import="com.first.EmployeeInMemoryStore"%>
<html>
<head>
  <title>Edit employee</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

  <%
  String id = request.getParameter("emp_id");
  int id3 = Integer.parseInt(id);
  System.out.println(id3);
 
  EmployeeStore empstore = new EmployeeInMemoryStore();
  Employee empObj = empstore.getEmployeeById(id3);
 
  
  	%>
  <h2>Enter Employee deatils</h2>
  <form action="edit" method="post">
   Enter Id:<input type="hidden" id="id" placeholder="Enter id" name="id" value="<%= empObj.getId()%>">
   Enter Name:<input type="text" id="name" placeholder="Enter Name" name="Name" value=" <%= empObj.getName()%>">
   Enter Salary:<input type="number" id="salary" placeholder="Enter Salary" name="salary" value="<%= empObj.getSalary()%> "> 
   Enter City:<input type="text" id="text" placeholder="Enter City" name="city" value="<%= empObj.getCity()%>">
   Enter WorkDomain:<input type="text" placeholder="Enter WorkDamain" name="workDomain" value="<%=empObj.getWorkDomain()%>">
    <button type="submit"  class="btn btn-default">Update</button>
  </form> 
</body>
</html>
