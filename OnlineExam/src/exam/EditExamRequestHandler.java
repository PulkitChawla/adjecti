package exam;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EditExamRequestHandler
 */
//@WebServlet("/EditExamRequestHandler")
public class EditExamRequestHandler implements RequestHandler {
	ExamStoreImpl examstore =  new ExamStoreImpl();
	@Override
	public String doProcess(HttpServletRequest req, HttpServletResponse response)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String desc=req.getParameter("desc");
		HttpSession session=req.getSession();
		Exam exam=(Exam)session.getAttribute("currentId"+id);
		examstore.updateExam(id);
		exam.setId(id);
		exam.setName(name);
		exam.setDesc(desc);
		return null;
	}

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

}