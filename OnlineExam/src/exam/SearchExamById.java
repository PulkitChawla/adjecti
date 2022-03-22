package exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchExamById
 */
@WebServlet("/SearchExamById")
public class SearchExamById extends HttpServlet implements RequestHandler  {
	private static final long serialVersionUID = 1L;
	ExamStoreImpl examstore =  new ExamStoreImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchExamById() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

    	String id1=request.getParameter("id");
		int id = Integer.parseInt(id1);
		System.out.println(id);
		examstore.delete(id);
		System.out.println("Deleted Successfully");
		//return id;
		return "success";
		
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	

}
