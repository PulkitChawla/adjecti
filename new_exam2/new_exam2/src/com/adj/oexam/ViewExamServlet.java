package com.adj.oexam;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewExamServlet implements RequestHandler {

	ExamRepository examstore= new AllExams();
	@Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Exam>emplist =examstore.getExamList();
		request.setAttribute("examlist", emplist);
		//response.sendRedirect("viewList.jsp");
		/*RequestDispatcher rd=request.getRequestDispatcher("viewExam.jsp");
		rd.forward(request, response);		*/
return "success";
	}

}
