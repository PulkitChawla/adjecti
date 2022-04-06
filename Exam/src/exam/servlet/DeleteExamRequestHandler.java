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
import exam.handler.ForwardMapping;

/**
 * Servlet implementation class DeleteExamServlet
 */
//@actionMapping(actionName="deleteExam",forward= {@ForwardMapping(key="success",page="deleteById.jsp"),@ForwardMapping(key="error",page="error.jsp")})
public class DeleteExamRequestHandler extends HttpServlet implements RequestHandler {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteExamRequestHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int eid=Integer.parseInt(request.getParameter("eid"));
		ExamDao eDao=new ExamDao();
		eDao.delete(eid);
		//RequestDispatcher rd=request.getRequestDispatcher("deleteById.jsp");
		
		//rd.forward(request, response);
		 out.print("<br><h2>Exam deleted Successfully!!</h2>");
	
		return "success";
	}

}
