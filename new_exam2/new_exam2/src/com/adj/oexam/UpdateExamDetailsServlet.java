package com.adj.oexam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateExamDetailsServlet extends HttpServlet implements RequestHandler {

	ExamRepository examstore= new AllExams();
	@Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String eid=request.getParameter("eid");
		int id=Integer.parseInt(eid);
		Exam e=examstore.getExamById(id);
		String ename = request.getParameter("ename");
		String heldBy = request.getParameter("heldBy");
		String state = request.getParameter("state");
		e.setEname(ename);
		e.setHeldBy(heldBy);
		e.setState(state);	
		//response.sendRedirect("viewExams.do");
return "success";
	}

}
