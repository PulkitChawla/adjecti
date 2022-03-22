package com.adj.oexam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddExamServlet implements RequestHandler {

	ExamRepository examstore = new AllExams();

	@Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String ename = request.getParameter("ename");
		String heldBy = request.getParameter("heldBy");
		String state = request.getParameter("state");
		Exam exam = new Exam(ename, heldBy, state);
		int curId = examstore.addExam(exam);
		/*
		 * RequestDispatcher rd=request.getRequestDispatcher("addExam.jsp");
		 * rd.forward(request, response);
		 */

		return "success";
	}

}
