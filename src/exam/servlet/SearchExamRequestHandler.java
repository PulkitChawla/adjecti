package exam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exam.annotation.actionMapping;
import exam.dao.ExamDao;
import exam.pojo.Exam;
import exam.handler.ForwardMapping;



//@actionMapping(actionName="searchExam",forward= {@ForwardMapping(key="success",page="searchExam.jsp"),@ForwardMapping(key="failure",page="error.jsp")})
public class SearchExamRequestHandler implements RequestHandler {
	private static final long serialVersionUID = 1L;
       
    
    public SearchExamRequestHandler() {
        super();
       
    }

	public String doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		PrintWriter out=response.getWriter();
		int eid=Integer.parseInt(request.getParameter("eid"));
		if(eid!=0) {
			Exam exam=ExamDao.searchById(eid);
			request.setAttribute("search", exam);
			System.out.println("Going in search"+exam);
			
		}
		return "success";
	}
}