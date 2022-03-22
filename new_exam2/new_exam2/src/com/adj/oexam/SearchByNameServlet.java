package com.adj.oexam;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchByNameServlet extends HttpServlet implements RequestHandler{

	ExamRepository examstore= new AllExams();
	@Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("SearchName");
		List<Exam> searchResultList = examstore.getExamByName(name);
		request.setAttribute("examlist", searchResultList);
		//response.sendRedirect("searchdetailByName.jsp");
     /* RequestDispatcher rd=request.getRequestDispatcher("searchByName.jsp");
		rd.forward(request, response);*/
		return "success";
	}

}
