package exam.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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

//@actionMapping(actionName="editExam",forward= {@ForwardMapping(key="success", page="editExam.jsp"),@ForwardMapping(key="failure",page="error.jsp")})
public class EditExamRequestHandler implements RequestHandler {
	private static final long serialVersionUID = 1L;
       
   
    public EditExamRequestHandler() {
        super();
      
    }

	
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		int eid=Integer.parseInt(request.getParameter("eid"));
		String ename=request.getParameter("ename");
		String edesc=request.getParameter("edesc");
		Exam exam=new Exam(eid,ename,edesc);
		ExamDao eDao=new ExamDao();
		int result=eDao.update(exam);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("editExam.jsp");
//	      dispatcher.include(request, response);
//	      out.print("<br><h2>Exam Edited Successfully!!</h2>");
//		doGet(request, response);
		RequestDispatcher rd=request.getRequestDispatcher("showExam.jsp");
		rd.forward(request, response);
	
	return "success";
	}
}
