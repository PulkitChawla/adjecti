package exam.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

import exam.annotation.actionMapping;
import exam.dao.ExamDao;
import exam.handler.ForwardMapping;
import exam.pojo.Exam;

//@action(actionName="addExam" , actionClass="exam.servlet.AddExamRequestHandler")
//@actionMapping(actionName="addExam",forward = { @ForwardMapping(key = "success", page = "addExam.jsp") ,@ForwardMapping(key="error",page="error.jsp")})
public class AddExamRequestHandler implements RequestHandler {
	private static final long serialVersionUID = 1L;
       
    public AddExamRequestHandler() {
        super(); 
    }

	@Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int eid=Integer.parseInt(request.getParameter("eid"));
		String ename=request.getParameter("ename");
		String edesc=request.getParameter("edesc");
		Exam exam=new Exam(eid,ename,edesc);
		ExamDao eDao=new ExamDao();
		String result=eDao.save(exam);
		
		
		if(result.equals("Exam added")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		      dispatcher.include(request, response);
		      out.print("<br><h2>Exam added Successfully!!</h2>");
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("addExam.jsp");
		      out.println("<font color=red>Please fill all the fields</font>");
		      dispatcher.include(request, response);
		}
		
	
		return "success";
	}
}
