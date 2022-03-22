package exam;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StoringRequestHandler
 */

public class ShowExamRequestHandler implements RequestHandler {
	private static final long serialVersionUID = 1L;
	

	@Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		ExamStoreImpl examStore=new ExamStoreImpl(); 
		response.setContentType("text/html");
		List<Exam> showList=examStore.getList();
		System.out.println(showList);
		request.setAttribute("showList", showList);
		RequestDispatcher rd=request.getRequestDispatcher("showExam.jsp");
		rd.forward(request, response);
		return "success";	
	}

	/*
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		RequestHandler obj=new AddExamRequestHandler();
		String fileName = config.getInitParameter("configFile");
		InputStream input = config.getServletContext().getResourceAsStream(fileName);
		Properties properties = new Properties();
		try {
			properties.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
*/
}
