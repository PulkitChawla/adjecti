package com.adj.oexam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteExamServlet extends HttpServlet implements RequestHandler {

	ExamRepository examstore= new AllExams();
	@Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String eId = request.getParameter("id");
		int id = Integer.parseInt(eId);
		Exam examId = examstore.getExamById(id);
		examstore.deleteById(examId);
		 //RequestDispatcher rd = request.getRequestDispatcher("viewExam.jsp");
		// rd.forward(request, response);
		/*response.sendRedirect("viewExams.do");*/
return "success";
	}

}
