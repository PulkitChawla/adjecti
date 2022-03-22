package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import java.lang.NullPointerException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet {

	EmployeeStore employeeStore = new EmployeeInMemoryStore();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String remember = req.getParameter("remember");
		String id = req.getParameter("id");
		int id1 = Integer.parseInt(id);
		System.out.println("Id is :" + id1);
		employeeStore.deleteEmployee(id1);	
		if (remember != null) {
			if (remember.equals("checked")) {
				out.println("<h2>Employee deleted with Id :" + id1 + "</h2>");

			} else {
				out.println("<h2> please checked the box </h2>");
			}
		}else {
			out.println("<h6> you have not chacked the chackbox </h6>");
			RequestDispatcher rd = req.getRequestDispatcher("delete_employee_By_id.jsp");
			rd.include(req, resp);

		}

	}
}
