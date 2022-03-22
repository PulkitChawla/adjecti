
package exam;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowExam extends HttpServlet {
	
	ExamStoreImpl examStore=new ExamStoreImpl(); 
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		List<Exam> showList=examStore.getList();
		System.out.println(showList);
		request.setAttribute("showList", showList);
		RequestDispatcher rd=request.getRequestDispatcher("showExam.jsp");
		rd.forward(request, response);	
	}
}
