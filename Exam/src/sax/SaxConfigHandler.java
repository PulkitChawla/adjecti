/*
 * package sax;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import javax.xml.parsers.ParserConfigurationException; import
 * javax.xml.parsers.SAXParser; import javax.xml.parsers.SAXParserFactory;
 * 
 * import org.xml.sax.Attributes; import org.xml.sax.SAXException; import
 * org.xml.sax.helpers.DefaultHandler;
 * 
 * import exam.pojo.Exam; import exam.servlet.Action; import
 * exam.servlet.Forward;
 * 
 * public class SaxConfigHandler extends DefaultHandler {
 * 
 * private static List<Action> actionList = new ArrayList<Action>(); static
 * Action currentAction; public static List<Action> doParse(String path) {
 * 
 * SAXParserFactory factory = SAXParserFactory.newInstance(); try { SAXParser
 * parser = factory.newSAXParser(); DefaultHandler defaultHandler = new
 * DefaultHandler() {
 * 
 * public void startDocument() throws SAXException {
 * //System.out.println("start of the document   : "); }
 * 
 * public void endDocument() throws SAXException {
 * //System.out.println("end of the document document     : "); }
 * 
 * public void startElement(String url,String localName,String qName,Attributes
 * attributes) throws SAXException { List<Forward> forwardList=new
 * ArrayList<Forward>(); if(qName.equalsIgnoreCase("action")) { Action action =
 * new Action(); //getting action-name tag from config.xml file String
 * actionName=attributes.getValue("actionName");
 * action.setActionName(actionName);
 * //System.out.println("Action Name"+currentAction.getActionName()); String
 * actionClass=attributes.getValue("actionClass");
 * action.setActionClass(actionClass);
 * System.out.println("Action Class"+action.getActionClass());
 * currentAction=action; currentAction.setForwardAction(new
 * ArrayList<Forward>()); } if(qName.equalsIgnoreCase("forward")) { Forward
 * forward=new Forward(); String key=attributes.getValue("key");
 * forward.setKey(key); String page=attributes.getValue("page");
 * forward.setPage(page); currentAction.getForwardAction().add(forward); } }
 * public void endElement(String uri, String localName, String qName) throws
 * SAXException { //System.out.println("end element      : " + qName);
 * if(qName.equalsIgnoreCase("action")) { actionList.add(currentAction); } } };
 * parser.parse(Thread.currentThread().getContextClassLoader().
 * getResourceAsStream(path),defaultHandler); } catch (Exception e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } return actionList; } }
 */