package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServletName  extends HttpServlet{

	
	EmployeeStore employeeStore1 = new EmployeeInMemoryStore();

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("Service 5....");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String remember = req.getParameter("remember");
		String name = req.getParameter("name");
		
		System.out.println("Name is :" +name);
		employeeStore1.deleteEmployeeByName(name);
		

		if (remember != null) {
			if (remember.equals("checked")) {
				out.println("<h2>Employee deleted with Name :" + name + "</h2>");
			}
		}else {
			out.println("<h6> you have not chacked the chackbox </h6>");
			RequestDispatcher rd = req.getRequestDispatcher("delete_By_name.jsp");
			rd.include(req, resp);
		}
	}
}