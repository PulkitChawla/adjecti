/*
 * package exam.servlet;
 * 
 * import java.io.IOException; import java.util.ArrayList; import
 * java.util.Arrays; import java.util.List;
 * 
 * import javax.servlet.RequestDispatcher; import javax.servlet.ServletConfig;
 * import javax.servlet.ServletException; import javax.servlet.http.HttpServlet;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse; import
 * javax.xml.parsers.DocumentBuilder; import
 * javax.xml.parsers.DocumentBuilderFactory;
 * 
 * import org.w3c.dom.Document; import org.w3c.dom.Element; import
 * org.w3c.dom.Node; import org.w3c.dom.NodeList;
 * 
 * import sax.ActionConfig;
 * 
 * import java.util.Scanner;
 * 
 * public class ActionRequestServletDOMParser extends HttpServlet { ActionConfig
 * actionConfig=null; public ActionRequestServletDOMParser() { super(); }
 * 
 * RequestDispatcher rd; RequestHandler handler; List<Action> actionList = new
 * ArrayList<>();
 * 
 * Forward forward = new Forward();
 * 
 * public void init(ServletConfig config) { String path =
 * config.getInitParameter("Config"); System.out.println(path); try {
 * actionConfig=new ActionConfig(path);
 * 
 * // DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); //
 * try { // DocumentBuilder builder = factory.newDocumentBuilder(); // Document
 * document = builder.parse(Thread.currentThread().getContextClassLoader().
 * getResourceAsStream(path)); // document.getDocumentElement().normalize(); //
 * System.out.println("Root element: " +
 * document.getDocumentElement().getNodeName()); // NodeList actionNodeList =
 * document.getElementsByTagName("action"); // // for (int i = 0; i <
 * actionNodeList.getLength(); i++) { // Action action = new Action(); //
 * List<Forward> forwardList = new ArrayList<>(); // Node node =
 * actionNodeList.item(i); // if (node.getNodeType() == Node.ELEMENT_NODE) { //
 * Element eElement = (Element) node; //
 * action.setActionName(eElement.getAttribute("actionName")); //
 * System.out.println("Action Name : " + action.getActionName()); //
 * action.setActionClass(eElement.getAttribute("actionClass")); //
 * System.out.println("Action Class : " + action.getActionClass()); // //
 * action.setForwardActions(eElement.getElementsByTagName("forward").item(0).
 * getTextContent()); // NodeList forwardNodeList = node.getChildNodes(); // for
 * (int j = 0; j < forwardNodeList.getLength(); j++) { // Node node2 =
 * forwardNodeList.item(j); // if (node2.getNodeType() == Node.ELEMENT_NODE) {
 * // Element eElement2 = (Element) node2; //
 * forward.setStatus(eElement2.getAttribute("key")); //
 * System.out.println("Key Name : " + forward.getStatus()); //
 * forward.setPage(eElement2.getAttribute("page")); //
 * System.out.println("Page Name : " + forward.getPage()); //
 * forwardList.add(forward); // action.setForwardAction(forwardList);// working
 * till here // } // } // actionList.add(action); } catch(Exception e) {
 * e.printStackTrace(); }
 * 
 * 
 * }
 * 
 * 
 * private RequestHandler getRequestHandler(Action action) { try { Class
 * c=Class.forName(action.getActionClass()); handler=(RequestHandler)
 * c.newInstance(); } catch (Exception e) { e.printStackTrace(); }
 * 
 * return handler;
 * 
 * }
 * 
 * protected void doGet(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { doPost(request, response);
 * //response.getWriter().append("Served at: ").append(request.getContextPath())
 * ;
 * 
 * }
 * 
 * protected void doPost(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { String requestHandlerpath =
 * request.getServletPath();
 * 
 * Action action=actionConfig.getAction(requestHandlerpath);
 * 
 * RequestHandler handler=getRequestHandler(action); String
 * status=handler.doProcess(request, response); String
 * page=actionConfig.getPageName(status,action); RequestDispatcher rd =
 * request.getRequestDispatcher(page); rd.forward(request, response);
 * 
 * } // public String getPageName(String status,Action action) { //
 * System.out.println("status"+status); // String page=""; // for(Forward
 * forward:action.getForwardAction()) { //
 * if(status.equals(forward.getStatus())) { //.equals("success") //
 * page=forward.getPage(); // } else if(status.equals("failure"))
 * {//.equals(forward.getStatus() // page=forward.getPage(); // } // } // return
 * page; // } // // private Action getAction(HttpServletRequest request) { //
 * String requestHandlerpath = request.getServletPath().substring(1); // String
 * requestString = requestHandlerpath; // //System.out.println(requestString);
 * // String urlArray[] = requestString.split("\\."); //
 * //System.out.println(Arrays.deepToString(urlArray)); //
 * //System.out.println(urlArray[0]); // String actionPath = urlArray[0]; //
 * //System.out.println(actionPath + " :url"); // for (Action action1 :
 * actionList) { // if (actionPath.equals(action1.getActionName())) { //
 * System.out.println("Going to success path"+action1.getActionName()); //
 * return action1; // } //// else { ////
 * System.out.println("going in else part"); //// } //
 * //System.out.println(action); // } // //return action1; // return null; // }
 * 
 * }
 */