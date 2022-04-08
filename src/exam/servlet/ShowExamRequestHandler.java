package exam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exam.dao.ExamDao;
import exam.pojo.Exam;

/**
 * Servlet implementation class ShowExamServlet
 */
//@actionMapping(actionName="viewExam",forward= {@ForwardMapping(key="success", page="viewExam.jsp"),@ForwardMapping(key="failure",page="error.jsp")})
public class ShowExamRequestHandler implements RequestHandler {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowExamRequestHandler() {
        super();
        // TODO Auto-generated constructor stub
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
		List<Exam> disp=eDao.getAllExams();
		return "Success";
	}

}
