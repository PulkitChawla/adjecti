package exam.annotation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exam.dao.ExamDao;
import exam.handler.ForwardMapping;
import exam.pojo.Exam;

@actionMapping(actionName = "Exam")
public class ExamRequestController {

	ExamDao eDao = new ExamDao();

	@requestMapping(path = "home")
	public String index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return "index.jsp";
	}

	@requestMapping(path = "add-page")
	public String add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return "addExam.jsp";
	}

	@requestMapping(path = "addExam")
	public String addExam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {// Exam e
		try {

			int eid = Integer.parseInt(request.getParameter("eid"));
			String ename = request.getParameter("ename");
			String edesc = request.getParameter("edesc");
			Exam exam = new Exam(eid, ename, edesc);
			String result = eDao.save(exam);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "addExam.jsp";

	}

	@requestMapping(path = "deleteExam")
	public String deleteExam(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		int eid = Integer.parseInt(request.getParameter("eid"));
		eDao.delete(eid);

		return "deleteById.jsp";
	}

	@requestMapping(path = "showExam")
	public String viewExam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Exam> emplist = eDao.getAllExams();
		request.setAttribute("examlist", emplist);
		return "showExam.jsp";
	}

	@requestMapping(path = "updateExam")
	public String updateExam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String eid = request.getParameter("eid");
		int id = Integer.parseInt(eid);
		Exam exam = eDao.searchById(id);

		String ename = request.getParameter("ename");
		String edesc = request.getParameter("edesc");

		exam.setExamName(ename);
		exam.setExamDesc(edesc);
		eDao.update(exam);
		return "editExam.jsp";
	}

	@requestMapping(path = "searchById")
	public String searchById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// String eid = request.getParameter("eid");
		int id = Integer.parseInt(request.getParameter("eid"));
		Exam exam = eDao.searchById(id);
		request.setAttribute("examlist", exam);
		return "searchExam.jsp";
	}

	@requestMapping(path = "login")
	public String login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		return "index.jsp";
	}

}
