/*
 * package sax;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import javax.servlet.http.HttpServletRequest;
 * 
 * import exam.servlet.Action; import exam.servlet.Forward;
 * 
 * public class ActionConfig {
 * 
 * private static List<Action> actions = new ArrayList<Action>();
 * 
 * public ActionConfig(String path) { actions = SaxConfigHandler.doParse(path);
 * 
 * for (Action action : actions) { System.out.println("Action Name:" +
 * action.getActionName()); System.out.println("Action Class" +
 * action.getActionClass()); for (Forward forward : action.getForwardAction()) {
 * System.out.println("Forward Key" + forward.getKey());
 * System.out.println("Forward Page" + forward.getPage()); } }
 * 
 * }
 * 
 * public Action getAction(String path) { String requestString =
 * path.substring(1); String urlArray[] = requestString.split("\\."); String
 * actionPath = urlArray[0]; for (Action action1 : actions) { if
 * (actionPath.equals(action1.getActionName())) {
 * System.out.println("Going to success path" + action1.getActionName()); return
 * action1; } // else { // System.out.println("going in else part"); // } //
 * System.out.println(action); } // return action1; return null; }
 * 
 * public String getPageName(String status, Action action) {
 * System.out.println("status" + status); String page = ""; for (Forward forward
 * : action.getForwardAction()) { if (status.equals(forward.getKey())) { //
 * .equals("success") page = forward.getPage(); } else if
 * (status.equals("failure")) {// .equals(forward.getStatus() page =
 * forward.getPage(); } } return page; } }
 */