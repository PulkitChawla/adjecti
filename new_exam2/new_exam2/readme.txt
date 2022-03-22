package com.adj.oexam;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class RequestContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ExamRepository examstore = new AllExams();
	Properties properties = new Properties();
	Class c = null;
	List<Action> actions = new ArrayList<>();
	RequestHandler handler;

	public RequestContoller() {
		super();
	}

	public void init(ServletConfig config) {

		// Using properties file
		/*
		 * String path = config.getInitParameter("prop"); try {
		 * properties.load(RequestContoller.class.getResourceAsStream(path));//works
		 * fine
		 * //properties.load(Thread.currentThread().getClass().getResourceAsStream(path)
		 * ); } catch (Exception e) { e.printStackTrace(); }
		 */

		// using xml file (xml parsing)

		String path = config.getInitParameter("config");

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(RequestContoller.class.getResourceAsStream(path));
			document.getDocumentElement().normalize();
			NodeList actionNodeList = document.getElementsByTagName("action");
			for (int i = 0; i < actionNodeList.getLength(); i++) {
				Node node = actionNodeList.item(i);
				Action action = new Action();
				List<Forward> forwardList = new ArrayList<>();
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;
					action.setActionName(eElement.getAttribute("action-name"));
					action.setClassName(eElement.getAttribute("action-class"));
					NodeList forwardNodeList = node.getChildNodes();
					for (int j = 0; j < forwardNodeList.getLength(); j++) {
						Node node2 = forwardNodeList.item(j);
						Forward forward = new Forward();
						if (node2.getNodeType() == Node.ELEMENT_NODE) {
							Element eElement2 = (Element) node2;
							forward.setStatus(eElement2.getAttribute("key"));
							forward.setPage(eElement2.getAttribute("page"));
							forwardList.add(forward);
						}
						action.setForwardActions(forwardList);
					}
					actions.add(action);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Action action = getAction(request);
		System.out.println(action.getActionName());
		handler=getHandler(action);
		System.out.println(handler.getClass().getName());
		String status = handler.doProcess(request, response);
		System.out.println(status);
		//String page = getPageName(status, handler);
		
		
		//System.out.println(status);

		/*
		 * String path = request.getServletPath(); //String regex =
		 * path.substring(1);//working fine String regex=path.replace("/", ""); String[]
		 * regex2 = regex.split(".do");
		 * 
		 * try { c = Class.forName(properties.getProperty(regex2[0])); RequestHandler
		 * handler = (RequestHandler) c.newInstance(); handler.doProcess(request,
		 * response);
		 * 
		 * } catch (Exception e) {
		 * 
		 * e.printStackTrace(); }
		 */

	}

	private Action getAction(HttpServletRequest req) {
		String path=req.getServletPath();
		String regex = path.substring(1);
		String[] regex2 = regex.split(".do");
		for (Action action : actions) {
			if (regex2[0].equals(action.getActionName())) {
				return action;
			}
		}
		return null; 
		
		/*Class c = null;
		Action action = new Action();
		String path = req.getServletPath();
		String regex = path.substring(1);
		String[] regex2 = regex.split(".do");
		for (Action action1 : actions) {
			if (regex2[0].equals(action1.getActionName())) {
				try {
					c = Class.forName(action1.getClassName());
					handler = (RequestHandler) c.newInstance();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return handler;*/
	}
	private RequestHandler getHandler(Action action) {
		try {
			c = Class.forName(action.getClassName());
			handler = (RequestHandler) c.newInstance();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return handler;
	}

	private String getPageName(String status, RequestHandler handler) {
		// TODO Auto-generated method stub
		return null;
	}


	/*
	 * private void runnnnn() { Class c = null; Action action = new Action(); String
	 * path = request.getServletPath(); String regex = path.substring(1); String[]
	 * regex2 = regex.split(".do"); String status = "failure"; String page = ""; for
	 * (Action action1 : actions) { if (regex2[0].equals(action1.getActionName())) {
	 * status = ""; for (Forward forward : action1.getForwardActions()) { if
	 * (status.equals(forward.getStatus())) { try { c =
	 * Class.forName(action1.getClassName()); RequestHandler handler =
	 * (RequestHandler) c.newInstance();
	 * System.out.println(handler.getClass().getName()); page = forward.getPage();
	 * //status = handler.doProcess(request, response);
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } } else if
	 * (status.equals(forward.getStatus())) { System.out.println("Error"); } } } } }
	 */
}
/*
 * public void doProcess(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { String
 * url=request.getServletPath(); switch(url) { case "/addexam.do":
 * addExam(request,response); break; case "/viewExams.do":
 * viewExam(request,response); break; case "/delete-by-id.do":
 * deleteById(request,response); break; case "/UpdateServlet.do":
 * getMethodEditForm(request,response);
 * 
 * break; case "/Updateform.do": editExam(request,response); break; case
 * "/search-by-id.do": searchById(request,response); break; case
 * "/search-by-name.do": searchByName(request,response); break; }
 * if(url.equals("/addexam")) { addAction(request,response); }else {
 * System.out.println("not working this method"); } }
 * 
 * private void searchByName(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException {
 * response.setContentType("text/html"); String name =
 * request.getParameter("SearchName"); List<Exam> searchResultList =
 * examstore.getExamByName(name); request.setAttribute("examlist",
 * searchResultList); //response.sendRedirect("searchdetailByName.jsp");
 * RequestDispatcher rd=request.getRequestDispatcher("searchByName.jsp");
 * rd.forward(request, response);
 * 
 * 
 * }
 * 
 * 
 * private void searchById(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { RequestHandler handler=new
 * SearchByIdServlet(); handler.doProcess(request, response); }
 * 
 * 
 * private void getMethodEditForm(HttpServletRequest request,
 * HttpServletResponse response) throws ServletException, IOException {
 * response.setContentType("text/html"); String
 * examId=request.getParameter("id"); int eid=Integer.parseInt(examId); Exam
 * emobj=examstore.getExamById(eid); request.setAttribute("editExam", emobj);
 * RequestDispatcher rd=request.getRequestDispatcher("editExam.jsp");
 * rd.forward(request, response);
 * 
 * }
 * 
 * 
 * private void editExam(HttpServletRequest request, HttpServletResponse
 * response) throws IOException, ServletException {
 * response.setContentType("text/html"); String eid=request.getParameter("eid");
 * int id=Integer.parseInt(eid); Exam e=examstore.getExamById(id); String ename
 * = request.getParameter("ename"); String heldBy =
 * request.getParameter("heldBy"); String state = request.getParameter("state");
 * e.setEname(ename); e.setHeldBy(heldBy); e.setState(state);
 * response.sendRedirect("viewExams.do");
 * 
 * }
 * 
 * 
 * private void deleteById(HttpServletRequest request, HttpServletResponse
 * response) throws IOException, ServletException { RequestHandler handler=new
 * DeleteExamServlet(); handler.doProcess(request, response);
 * 
 * }
 * 
 * 
 * private void viewExam(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { RequestHandler handler=new
 * ViewExamServlet(); handler.doProcess(request, response); }
 * 
 * 
 * private void addExam(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { RequestHandler handler=new
 * AddExamServlet(); handler.doProcess(request, response); }
 * 
 * }
 * 
 * 
 * 
 * //init //doget //dopost
 */