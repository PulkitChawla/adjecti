/*
 * package exam.sax;
 * 
 * import java.io.IOException; import java.util.ArrayList; import
 * java.util.List;
 * 
 * import javax.xml.parsers.ParserConfigurationException;
 * 
 * import org.xml.sax.SAXException;
 * 
 * import exam.handler.ActionHandler; import exam.servlet.Action; import
 * exam.servlet.Forward;
 * 
 * public class ActionConfigSAX { private static List<Action> actions = new
 * ArrayList<Action>();
 * 
 * // public ActionConfigSAX() { // ActionHandler actionHandler=new
 * ActionHandler(); // actions=actionHandler.getAllActions(); //
 * System.out.println("Action handler"); // for(Action action:actions) { //
 * System.out.println(action); // } // }
 * 
 * 
 * // public ActionConfig(String path) { // try { // actions =
 * SaxConfigHandler.doParse(path); // } catch (ParserConfigurationException e) {
 * // // TODO Auto-generated catch block // e.printStackTrace(); // } catch
 * (SAXException e) { // // TODO Auto-generated catch block //
 * e.printStackTrace(); // } catch (IOException e) { // // TODO Auto-generated
 * catch block // e.printStackTrace(); // } // }
 * 
 * public static Action getAction(String pathservlet) {
 * 
 * Action act = null; String rqstPath = pathservlet.substring(1); String
 * requestedString = rqstPath; String stringUrlArray[] =
 * requestedString.split("\\."); // //
 * System.out.println(Arrays.toString(stringUrlArray)); String actionPath =
 * stringUrlArray[0]; // System.out.println(actionPath + " :url");
 * 
 * for (Action action1 : actions) { if
 * (actionPath.equals(action1.getActionName())) { act=action1; }
 * 
 * } return act; }
 * 
 * 
 * public static String getPage(String key, Action action) {
 * 
 * 
 * String pageName=""; for(Forward forward:action.getForwardAction()) {
 * if(key.equalsIgnoreCase(forward.getKey())) { pageName=forward.getPage();
 * System.out.println(pageName); } } return pageName;
 * 
 * }
 * 
 * 
 * }
 */