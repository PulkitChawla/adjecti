/*
 * package exam.sax;
 * 
 * import java.io.IOException; import java.util.ArrayList; import
 * java.util.List;
 * 
 * import javax.servlet.http.HttpServletRequest; import
 * javax.xml.parsers.ParserConfigurationException; import
 * javax.xml.parsers.SAXParser; import javax.xml.parsers.SAXParserFactory;
 * 
 * import org.xml.sax.Attributes; import org.xml.sax.SAXException; import
 * org.xml.sax.helpers.DefaultHandler;
 * 
 * import exam.servlet.RequestHandler; import exam.servlet.Action; import
 * exam.servlet.Forward;
 * 
 * 
 * public class SaxConfigHandler { static List<Action> actionList = new
 * ArrayList<Action>();
 * 
 * public static List<Action> doParse(String path) throws
 * ParserConfigurationException, SAXException, IOException {
 * 
 * // Action currentAction; SAXParserFactory factory =
 * SAXParserFactory.newInstance(); SAXParser parser = factory.newSAXParser();
 * DefaultHandler defaultHandler = new DefaultHandler() { Action currentAction;
 * 
 * public void startElement(String url,String localName,String qName,Attributes
 * attributes) {
 * 
 * 
 * if (qName.equalsIgnoreCase("action")) { Action action = new Action(); String
 * actionName = attributes.getValue("actionName");
 * action.setActionName(actionName); //
 * System.out.println("Action Name"+action.getActionName());
 * 
 * String actionClass = attributes.getValue("actionClass");
 * action.setActionClass(actionClass); //
 * System.out.println("Action Class"+action.getActionClass());
 * action.setForwardAction(new ArrayList<Forward>()); currentAction = action; }
 * if (qName.equalsIgnoreCase("forward")) { Forward forward = new Forward();
 * 
 * String key = attributes.getValue("key"); forward.setKey(key); //
 * System.out.println("key :"+ forward.getKey()); String page =
 * attributes.getValue("page"); forward.setPage(page); //
 * System.out.println("page :"+ forward.getPage());
 * 
 * currentAction.getForwardAction().add(forward);
 * 
 * } }
 * 
 * public void endElement(String url, String localName, String qName) { if
 * (qName.equalsIgnoreCase("action")) { actionList.add(currentAction); } } };
 * parser.parse(Thread.currentThread().getContextClassLoader().
 * getResourceAsStream(path), defaultHandler); return actionList;
 * 
 * // parser.parse(ActionConfig.class.getResourceAsStream(path),
 * defaultHandler); // return actionList; }
 * 
 * 
 * }
 */