package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditServlet extends HttpServlet {
	EmployeeStore empStore = new EmployeeInMemoryStore();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		System.out.println("EditServlet....service");
		out.println("Updated data ...");
//	Employee emp = new Employee();

		String id = req.getParameter("id");
		int id1 = Integer.parseInt(id);
		Employee emp = empStore.getEmployeeById(id1);
		String name = req.getParameter("Name");
		emp.setName(name);
		String salary = req.getParameter("salary");
		double salary1 = Double.parseDouble(salary);
		emp.setSalary(salary1);
		String city = req.getParameter("city");
		emp.setCity(city);
		String workDomain = req.getParameter("workDomain");
		emp.setWorkDomain(workDomain);
		String remember =req.getParameter("remember");
		
		      out.println("<h2> Id :"+id1+"</h2>");
			  out.println("<h2> Name :"+name+"</h2>");
			  out.println("<h2> Salary :"+salary1+"</h2>");
			  out.println("<h2> City :"+city+"</h2>");
			  out.println("<h2> WorkDomain :"+workDomain+"</h2>");
			  
			  // RequestDispatcher rd1 = req.getRequestDispatcher("success"); //
			  //rd1.forward(req, resp);
			  
			  
	}
}

//		String id = req.getParameter("id");
// int id1 = Integer.parseInt(id);
/*
 * String salary = req.getParameter("salary"); double salary1 =
 * Double.parseDouble(salary); String city = req.getParameter("city"); String
 * workDomain= req.getParameter("workDomain"); String remember =
 * req.getParameter("remember"); Employee emp1 = new
 * Employee(id1,name,salary1,city,workDomain); // empStore.addEmployee(emp1);
 * 
 * // empStore.UpdateEmployee(emp1); if(remember!= null) {
 * if(remember.equals("checked")) { out.println("<h2> Id :"+id1+"</h2>");
 * out.println("<h2> Name :"+name+"</h2>");
 * out.println("<h2> Salary :"+salary1+"</h2>");
 * out.println("<h2> City :"+city+"</h2>");
 * out.println("<h2> WorkDomain :"+workDomain+"</h2>");
 * 
 * // RequestDispatcher rd1 = req.getRequestDispatcher("success"); //
 * rd1.forward(req, resp);
 * 
 * 
 * } }else { out.println("<h6> you have not chacked the chackbox </h6>");
 * //RequestDispatcher rd = req.getRequestDispatcher("addEmployee.jsp");
 * //rd.include(req, resp); } }
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 */
