package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteExamRequestHandler
 */
@WebServlet("/DeleteExamRequestHandler")
public class DeleteExamRequestHandler extends HttpServlet implements RequestHandler {
	private static final long serialVersionUID = 1L;
	ExamStoreImpl examstore =  new ExamStoreImpl();

	public String doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException { 
		// TODO Auto-generated method stub

		String id1=request.getParameter("id");
		int id = Integer.parseInt(id1);
		System.out.println(id);
		examstore.delete(id);
		PrintWriter out=response.getWriter();
		out.print("Deleted Successfully");
		return "success";
	}
}