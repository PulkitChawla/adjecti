package com.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpController extends HttpServlet {

	EmployeeStore employeestore =  new EmployeeInMemoryStore();
/*
	@Override
	public void init(ServletConfig config) throws ServletException {
	String storeName = config.getInitParameter("EmployeeStore");
		try {	
			Class s1 = Class.forName(storeName);
			employeestore = (EmployeeStore)s1.newInstance();
			System.out.println(employeestore);
		} catch(Exception e) {
			e.printStackTrace();	} 
	}
*/
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String id =req.getParameter("id");
		int id1 = Integer.parseInt(id);
		String name = req.getParameter("Name");
		String salary = req.getParameter("salary");
		double salary1 = Double.parseDouble(salary);
		String city = req.getParameter("city");
		String workDomain = req.getParameter("workDomain");
	
		Employee emp1 = new Employee(id1, name, salary1, city, workDomain);
		employeestore.addEmployee(emp1);
		out.println("add successfully......");
	}
}
