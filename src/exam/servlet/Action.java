package exam.servlet;

import java.util.List;

import exam.servlet.MethodList;

import java.lang.reflect.Method;

public class Action {

	private String actionName;
	private String actionClass;
	private List<MethodList> methodList;
	public Action() {
		super();
		
	}
	public Action(String actionName, String actionClass, List<MethodList> methodList) {
		super();
		this.actionName = actionName;
		this.actionClass = actionClass;
		this.methodList = methodList;
	}
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	public String getActionClass() {
		return actionClass;
	}
	public void setActionClass(String actionClass) {
		this.actionClass = actionClass;
	}
	public List<MethodList> getMethodList() {
		return methodList;
	}
	public void setMethodList(List<MethodList> methodList) {
		this.methodList = methodList;
	}
	@Override
	public String toString() {
		return "Action [actionName=" + actionName + ", actionClass=" + actionClass + ", methodList=" + methodList + "]";
	}
	
	
	
	
}