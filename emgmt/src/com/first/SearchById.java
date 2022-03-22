package com.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchController
 */

public class SearchById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   EmployeeStore empStore=new EmployeeInMemoryStore();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
		PrintWriter out=response.getWriter();
		String id1=request.getParameter("id");
		int id=Integer.parseInt(id1);
		Employee emp= empStore.getEmployeeById(id);
		System.out.println(id);
		System.out.println(emp);
		out.print(emp.getId());
		out.print(emp.getName());
		out.print(emp.getSalary());
		out.print(emp.getCity());
		out.print(emp.getWorkDomain());
		
		
		
	
		
		
	}
}