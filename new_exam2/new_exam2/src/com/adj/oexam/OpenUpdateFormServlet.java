package com.adj.oexam;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OpenUpdateFormServlet extends HttpServlet implements RequestHandler {

	ExamRepository examstore= new AllExams();
	@Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");	
		String examId=request.getParameter("id");
		int eid=Integer.parseInt(examId);
		Exam emobj=examstore.getExamById(eid);
		request.setAttribute("editExam", emobj);
		/*RequestDispatcher rd=request.getRequestDispatcher("editExam.jsp");
		rd.forward(request, response);*/
return "success";
	}

}
