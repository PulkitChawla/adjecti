package exam;

//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

public class Old {
	
//	protected void doprocess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		String url = req.getServletPath();
//		System.out.println("request servlet path"+url);
//		switch(url) {
//		case "/add.do":
//			addAction(req, resp);
//			PrintWriter out=resp.getWriter();
//			break;
//		case "/view.do":
//			viewAction(req, resp);
//			break;
//		case "/delete.do":
//			deleteAction(req,resp);
//			break;
//		case "/editexam.do":
//			editGetAction(req,resp);
//			break;
//		case "/editform.do":
//			editPostAction(req,resp);
//			break;
//		case "/search.do":
//			searchAction(req,resp);
//			break;
//		
//
//}
//}
//
//	private String addAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//		
//		int id=Integer.parseInt(req.getParameter("id"));
//		String name=req.getParameter("name");
//		String desc=req.getParameter("desc");
//		String action=req.getParameter("action");
//		Exam e = new Exam(id,name,desc);
//		examstore.addExam(e);
//        PrintWriter out=resp.getWriter();
//        out.print("Added Sucessfully");
//		return action;
//		
//		/*
//		 		InputStream inputStream = null;
//		String result="";
//		try {
//			Properties prop = new Properties();
//			String propFileName = "config.properties";
//			
//			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
// 
//			if (inputStream != null) {
//				prop.load(inputStream);
//			} else {
//				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
//			}
// 
//			Date time = new Date(System.currentTimeMillis());
// 
//			// get the property value and print it out
//			String user = prop.getProperty("name");
//			String company1 = prop.getProperty("username");
//			String company2 = prop.getProperty("password");
//			String company3 = prop.getProperty("location");
// 
//			result = "Company List = "+"Name="+user +", "+"Username=" +company1 + ","+"password= " + company2 + ","+"location " + company3;
//			System.out.println(result + "\nProgram Ran on " + time + " by user=" + user);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			inputStream.close();
//		}
//		return result;
//		 */
//
//	}
//	
//	private void viewAction(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//		List<Exam> list = examstore.getList();
//		System.out.println(list);
//		req.setAttribute("show", list);
//		RequestDispatcher rd = req.getRequestDispatcher("showExam.jsp");
//		rd.forward(req, resp);
//		System.out.println("Show Exam Working");
//	}
//
//	private void deleteAction(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String id1=req.getParameter("id");
//		int id = Integer.parseInt(id1);
//		System.out.println(id);
//		examstore.delete(id);
//		System.out.println("Deleted Successfully");
//	}
//	
//	
//	private void editPostAction(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		int id=Integer.parseInt(req.getParameter("id"));
//		Exam exam=examstore.update(id);
//		String name=req.getParameter("name");
//		exam.setName(name);
//		String descr=req.getParameter("desc");
//		exam.setDescr(descr);
//	}
//
//	private void editGetAction(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		int id=Integer.parseInt(req.getParameter("id"));
//		Exam exam=examstore.update(id);
//		req.setAttribute("edit",exam);
//		RequestDispatcher rd=req.getRequestDispatcher("editExam.jsp");		
//		rd.forward(req, resp);
//	}
//	
//	
//	
//	
//	private void searchAction(HttpServletRequest req, HttpServletResponse resp) {
//		// TODO Auto-generated method stub
//		int id=Integer.parseInt(req.getParameter("id"));
//		List<Exam> list=examstore.getList();
//	
//		
//	}

}
