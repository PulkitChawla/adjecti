package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddExamRequestHandler implements RequestHandler{
	ExamStoreImpl examstore =  new ExamStoreImpl();
	@Override
	public String doProcess(HttpServletRequest req, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String desc=req.getParameter("desc");
		Exam e = new Exam(id,name,desc);
		examstore.addExam(e);
		PrintWriter out=response.getWriter();
		out.print("Added Sucessfully");
		return "success";
	}

}
