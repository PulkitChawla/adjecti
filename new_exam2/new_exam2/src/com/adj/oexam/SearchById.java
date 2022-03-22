package com.adj.oexam;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchById implements RequestHandler {

	@Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*RequestDispatcher dispatcher=request.getRequestDispatcher("searchById.jsp");
		dispatcher.forward(request, response);*/
return "success";
	}

}
