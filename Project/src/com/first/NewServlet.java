package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet extends HttpServlet {
EmployeeStore empStore = new EmployeeInMemoryStore();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	System.out.println("service 5");
	
	String id =req.getParameter("id");
	int id1 = Integer.parseInt(id);
	empStore.deleteEmployee(id1);
	RequestDispatcher rd = req.getRequestDispatcher("displayEmp.jsp");
	rd.forward(req, resp);
	
	
	}
	
}
