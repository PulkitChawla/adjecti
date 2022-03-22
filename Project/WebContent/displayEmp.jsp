<%@page import="java.util.*"%>
<%@ page import ="com.first.EmployeeInMapStore" %>
<%@page import="com.first.EmployeeInMemoryStore"%>
<%@page import="com.first.EmployeeStore"%>
<%@page import="com.first.Employee" %>
<html> 
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>

<body>
	<table  class="table" >
	<thead>
         <tr>
            <th>EmployeeId</th>
            <th>EmployeeName</th>
            <th>EmployeeSalary</th>
            <th>EmployeeCity</th>
            <th>WorkDomain</th>
            <th>DeleteEmployee</th>
          </tr>   
   </thead>
  <tbody>
  <%
  System.out.println("test");
  List<Employee> empList =(List<Employee>)request.getAttribute("employeeList");
	System.out.println(empList);
  for (int i = 0; i < empList.size(); i++) {
  	Employee empObj = empList.get(i);	

  %>
  
  <tr>
   		<td><%=empObj.getId()%></td>
   		<td><%=empObj.getName()%></td>
   		<td><%=empObj.getSalary()%></td>
   		<td><%=empObj.getCity()%></td>
   		<td><%=empObj.getWorkDomain()%></td>        
<td>
<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#data" onclick="showView(<%=empObj.getId()%>)">
DeleteEmployee</button>
</td>
</tr>
<%} %>
   </tbody>

	</table>
	
	<div class="modal fade" id="data" tabindex="-1" >
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Delete Employee details</h5>
        
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      
      <div class="modal-body">
        delete employee
      </div>
       <form action ="Delete3" method="post" id ="delete-data">
        <input name="id"> 
      <div class="modal-footer">   
         <button type="submit" >Yes</button>             
       	 <button type="button" class="btn btn-primary" data-dismiss="modal">No</button>
      </div>
      </form> 
    </div>
  </div>
</div> 
  
</body>
</html>