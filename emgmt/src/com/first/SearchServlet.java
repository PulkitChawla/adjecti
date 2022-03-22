package com.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet {
	EmployeeStore employeelist1 = new EmployeeInMemoryStore();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	System.out.println("Search service....");
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	String remember = req.getParameter("remember");
	String id = req.getParameter("id");
	int id1 = Integer.parseInt(id);
	System.out.println("Id is :"+id1);
	
	//Employee emp1 = new Employee(id1,name,salary1,city,workDomain);
    
	

  Employee emp2 =  employeelist1.getEmployeeById(id1);

  if(remember!= null) {
		if(remember.equals("checked")) {
		if(id1==emp2.getId()) {
			out.println("<h2> Id :"+emp2.getId()+"</h2>");
			out.println("<h2> Name :"+emp2.getName()+"</h2>");
			out.println("<h2> Salary :"+emp2.getSalary()+"</h2>");
			out.println("<h2> City :"+emp2.getCity()+"</h2>");
			out.println("<h2> WorkDomain :"+emp2.getWorkDomain()+"</h2>");
		}
			
	}}
	else {
		System.out.println("Please enter right Employee id");
		out.println("<h5>Please enter right Employe id</h5>");
	   RequestDispatcher rd = req.getRequestDispatcher("SearchEmployeeByName.jsp");
	  rd.include(req, resp);
	}
	
	}}
