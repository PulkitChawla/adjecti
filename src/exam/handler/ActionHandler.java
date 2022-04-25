package exam.handler;

//import exam.annotation.actionMapping;
//import java.lang.annotation.Annotation;
//import exam.servlet.Action;
//import exam.servlet.Forward;
//
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.reflections.Reflections;


public class ActionHandler {
//	public static List<Action> actionList=new ArrayList();
//	String packagePath = "";
//	
//
//	public ActionHandler(String path) {
//		this.packagePath = path;
//		actionList = getAllActions(path);
//	}

//	public List<Action> getAllActions(String path)
//	{
//		Reflections reflection=new Reflections("exam.servlet");//exam.annotation
//		for(Class classs: reflection.getTypesAnnotatedWith(actionMapping.class)) {
//			actionMapping actionMapping1=(actionMapping) classs.getAnnotation(actionMapping.class); 
//			Action action=new Action();
//			
//			Forward f=null;
//			List<Forward> forwardList=new ArrayList<Forward>();
//			ForwardMapping fMap[]=actionMapping1.forward();
//			for(ForwardMapping fm:fMap) {
//				
//				f=new Forward(fm.key(), fm.page());
//				forwardList.add(f);	
//			}
//			 action=new Action(actionMapping1.actionName(), classs.getName(), forwardList, null);
//			actionList.add(action);
//		}
//		
//		for(Action a:actionList) {
//			System.out.println(a);
//		}
//		return actionList;
//
//	}
//public static String getPage(String key, Action action) {
//		
//		
//		String pageNameString="";
//		for(Forward forward:action.getForwardAction()) {
//			if(key.equalsIgnoreCase(forward.getKey())) {
//				pageNameString=forward.getPage();
//			}
//		}
//		return key;
//		
//	}
}
