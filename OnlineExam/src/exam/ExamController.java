package exam;

import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class ExamController extends HttpServlet {


	public ExamController() {
		super();
	}

	public void init(ServletConfig config) {
		String StoreName = config.getInitParameter("appConfig");
		System.out.println(StoreName);
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestHandler rh ;
		String requestHandlerPath = request.getServletPath().substring(1);
		String requestedString = requestHandlerPath;
        String stringUrlArray[] = requestedString.split("\\.");
        System.out.println(Arrays.toString(stringUrlArray));
        System.out.println(stringUrlArray[0]);		
        String firstStringPart = stringUrlArray[0];
	
		
		System.out.println(firstStringPart + "  :url");
		
		
		try {
			 Class c  = Class.forName(handlerClassName);
			RequestHandler rh1= (RequestHandler) c.newInstance();
			rh1.doProcess(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	}
}
//	protected void doPost1(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String rqstpath = req.getServletPath().substring(1);
//		String rqststr= rqstpath;
//		System.out.println("rqstpath " + rqststr);
//		String strUrlArray[] = rqststr.split("\\.");
//		String firstPart = strUrlArray[0];
//		System.out.println("firstpart " + firstPart);
//		
//		String handlerClass = prop.getProperty(firstPart);
//		System.out.println("urlpath :" + handlerClass);
//		
//		FileReader fis = new FileReader("Config.properties");
//		String addExam = prop.getProperty("AddExam");
//		
//		if(handlerClass.equals(addExam)) {
//			handlerClass.doProcess(req,resp);
//		}else {
//			System.out.println("not working");
//		}
//		
//	}