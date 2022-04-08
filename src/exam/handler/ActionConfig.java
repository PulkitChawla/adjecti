package exam.handler;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.reflections.Reflections;

import exam.annotation.MethodHandler;
import exam.annotation.actionMapping;
import exam.annotation.requestMapping;
import exam.servlet.Action;
import exam.servlet.Forward;
import exam.servlet.MethodList;

public class ActionConfig {
	private static List<Action> actionList = new ArrayList<Action>();

	// const used for calling the getAcion method to get the actionList
	public ActionConfig(String path) {

		actionList = MethodHandler.getCustomAnnotation();
//		System.out.println(actionList);

	}

	// Here we are finding the action object which matched with path url and action
	// name which store in action object

	public static Action getAction(String path) {
		Action act = null;
		String rqstPath = path.substring(1);

		String requestedString = rqstPath;

		String stringUrlArray[] = requestedString.split("\\.");

		String actionPath = stringUrlArray[0];

		for (Action action1 : actionList) {

			for (MethodList m : action1.getMethodList()) {
				if (actionPath.equals(m.getMethodpath())) {
					System.out.println("----------inside MethodList for loop-----------" + m.getMethodpath());
					act = action1;

				}
			}

		}
		return act;

	}

	// Here we finding the particluar method incomparison of url and method
	// annotated path
	public MethodList getMethods(Action action, String path) throws Exception {
		MethodList meth = null;
		String rqstPath = path.substring(1);

		String requestedString = rqstPath;

		String stringUrlArray[] = requestedString.split("\\.");

		String actionPath = stringUrlArray[0];

		for (MethodList method : action.getMethodList()) {

			if (actionPath.equals(method.getMethodpath())) {
				meth = method;

			}

		}
		return meth;

	}

//	private static List<Action> actionList = new ArrayList<Action>();
//	List<Method> methodsList=new ArrayList<Method>();
//	String packagePath = "";
//	
//	public ActionConfig() {
//		
//	}
//	
//	public ActionConfig(String path) {
//		
//		this.packagePath = path;
//		actionList=getAllActions(path);
//	}
//	
//	public List<Action> getAllActions(String path)
//	{
//		Reflections reflection=new Reflections(path);// "exam.annotation"       //exam.servlet
//		for(Class classs: reflection.getTypesAnnotatedWith(actionMapping.class)) {
//			actionMapping actionMapping1=(actionMapping) classs.getAnnotation(actionMapping.class); 
//			Action action=new Action();
//			action.setActionClass(classs.getName());
//			// System.out.println(annotatedActionClass.getClassName());
//			try {
//				requestMapping annotation = (requestMapping) classs.getAnnotation(requestMapping.class);
//				Method[] declaredMethods = classs.getDeclaredMethods();
//				for (Method method : declaredMethods) {
//					requestMapping annotation2 = method.getAnnotation(requestMapping.class);
//					actionList.add(annotation2.path().substring(1));
//					action.setActionName(actionList);
//					methodsList.add(method);
//					System.out.println(methodsList);
//					action.setMethodList(methodsList);
//				}
//				actionList.add(action);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
////		for(Action a:actionList) {
////			System.out.println(a);
////		}
//		
//		}
//		return actionList;
//		//Forward f=null;
////		List<Forward> forwardList=new ArrayList<Forward>();
////		ForwardMapping fMap[]=actionMapping1.forward();
////		for(ForwardMapping fm:fMap) {
////			
////			f=new Forward(fm.key(), fm.page());
////			forwardList.add(f);	
////		}
////		 action=new Action(actionMapping1.actionName(), classs.getName(), forwardList, null);
////		actionList.add(action);
//	//}
//	}
//		
//	
//	public static Action getAction(String pathservlet) 
//	{
//		Action act = null;
//		String rqstPath = pathservlet.substring(1);
//		System.out.println("request path"+rqstPath);
//		String requestedString = rqstPath;
//		System.out.println("request string"+requestedString);
//		String stringUrlArray[] = requestedString.split("\\."); //
//		System.out.println(Arrays.toString(stringUrlArray));
//		String actionPath = stringUrlArray[0]; 
//		System.out.println(actionPath + " :url");
//		System.out.println(actionList);
//		for (Action action1 : actionList) {
//			System.out.println(actionList);
//			if (actionPath.equals(action1.getActionName())) {
//				act=action1;
//				System.out.println("Picking action"+act);
//			}
//			
//		}
//		return act;
//	}
//	public static String getPage(String key, Action action) {
//		
//		String pageNameString="";
//		for(Forward forward:action.getForwardAction()) {
//			if(key.equalsIgnoreCase(forward.getKey())) {
//				pageNameString=forward.getPage();
//			}
//		}
//		return pageNameString;
//	}
//	
//	public Method getControllerMethod(Action action, String path) throws Exception {
//
//		String[] regex2 = path.split(".do");
//		System.out.println(regex2[0]);
//		
//		for (Method method : action.getMethodList()) {
//			requestMapping annotation = method.getAnnotation(requestMapping.class);
//			if (regex2[0].equals(annotation.path())) {
//				System.out.println("Method name=" + method.getName() + " annotation path=" + annotation.path());
//				return method;
//			}
//		}
//		return null;
//	}
//	
//	//getting methods one by one
//	public List<Method> getControllerMethod(HttpServletRequest request, HttpServletResponse response) {
//		Reflections reflections = new Reflections();
//		for (Class annotatedClass : reflections.getTypesAnnotatedWith(requestMapping.class)) {
//			Action action=new Action();
//			action.setActionClass(annotatedClass.getName());
//			System.out.println(action.getActionClass());
//			try {
////				Class examHandler = Class.forName(annotatedClass.getName());
////				Object newInstance = examHandler.newInstance();
//				requestMapping annotation = (requestMapping) annotatedClass.getAnnotation(requestMapping.class);
//				Method[] declaredMethods = annotatedClass.getDeclaredMethods();
//				for (Method method : declaredMethods) {
//					requestMapping mapping2=method.getAnnotation(requestMapping.class);
//					action.setActionName(mapping2.path().substring(1));
//					methodsList.add(method);
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return methodsList;
//	}
//	
}
