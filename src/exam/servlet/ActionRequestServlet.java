package exam.servlet;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import exam.annotation.ExamRequestController;
import exam.handler.ActionConfig;
import exam.user.User;

@WebServlet
public class ActionRequestServlet extends HttpServlet {

	ActionConfig actionConfig;
	List<Action> actionList = new ArrayList();

	public void init(ServletConfig config) {

		actionConfig = new ActionConfig("exam.handler");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();

		try {
			// step 1

			Action action = ActionConfig.getAction(path);

			// step 2
			MethodList method = actionConfig.getMethods(action, path);

			// step 3
			Class actionClassObj = Class.forName(action.getActionClass());
			Method m = actionClassObj.getMethod(method.getMethodName(), HttpServletRequest.class,
					HttpServletResponse.class);
			Object actionObj = actionClassObj.newInstance();

			// step 4
			String view = (String) m.invoke(actionObj, request, response);

			// step 5
//			
//			HttpSession session=request.getSession();
//			User user=(User)session.getAttribute("current_user");
//			if(user == null) {
//				RequestDispatcher dispatcher1 = request.getRequestDispatcher("login.jsp");
//				dispatcher1.forward(request, response);
//			}else {
				RequestDispatcher dispatcher1 = request.getRequestDispatcher(view);//logout.jsp
				dispatcher1.forward(request, response);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

//		String path=request.getServletPath();
//		System.out.println("Path "+path);
//		// get action according to request url
//		
//		try {
//			// step 1
//			Action action = actionConfig.getAction(path);
//			System.out.println("Action"+action);
//			
//			// step 2
//			Method controllerMethod = actionConfig.getControllerMethod(action, path);
//			System.out.println("Method"+controllerMethod);
//			
//			// step 3
//			Class actionClassObj = Class.forName(action.getActionClass());
//			System.out.println(controllerMethod);
//			actionClassObj.getMethod(controllerMethod.getName(), HttpServletRequest.class,HttpServletResponse.class);
//			Object actionObj = actionClassObj.newInstance();
//			
//			//step 4
//			String view=(String)controllerMethod.invoke(actionObj, request, response);
//
//			//step 5
//			RequestDispatcher rd = request.getRequestDispatcher(view);
//			rd.forward(request, response);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		Action actionUrl =ActionConfig.getAction(request.getServletPath());
//		System.out.println("Checking Action"+actionUrl);
//		RequestHandler handler = getRequestHandler(actionUrl);
//		System.out.println("Checking handler"+handler);
//		String key = null;
//
//		// call process method String key = null;
//		try {
//			key = handler.doProcess(request, response);
//			String pageName = ActionConfig.getPage(key, actionUrl);
//
//			RequestDispatcher rd = request.getRequestDispatcher(pageName);
//			rd.forward(request, response);
//
//		} catch (ServletException | IOException e){
//			
//			e.printStackTrace();
//		}
		
//		// get page name based on key returned from process call
//		String pageName = getPage(key, actionUrl);
//
//		// get RequestDispatcher and forward
//		RequestDispatcher rd = request.getRequestDispatcher(pageName);
//		rd.forward(request, response);

	}

//	RequestHandler getRequestHandler(Action action) {
//
//		RequestHandler  handler= null;
//		
//		try {
//			Class reqClass=Class.forName(action.getActionClass());
//			handler=(RequestHandler)reqClass.newInstance();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return handler;
//
//	}

//	private String getPage(String key, Action action) {
//		System.out.println("key :" + key);
//		String page = "";
//		for (Forward forward : action.getForwardAction()) {
//			if (key.equals(forward.getKey())) {
//				page = forward.getPage();
//			} else if (key.equals("failure")) {
//				page = forward.getPage();
//			}
//		}
//		return page;
//	}

}
