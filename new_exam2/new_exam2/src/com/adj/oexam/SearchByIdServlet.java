package com.adj.oexam;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchByIdServlet extends HttpServlet implements RequestHandler {

	ExamRepository examstore= new AllExams();
	@Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String empId=request.getParameter("searchId");
		int id=Integer.parseInt(empId);				
		Exam exam = examstore.getExamById(id);
		request.setAttribute("examlist", exam);		
		/*RequestDispatcher rd=request.getRequestDispatcher("searchById.jsp");
		rd.forward(request, response);	*/
return "success";
	}

}
