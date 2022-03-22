package com.adj.oexam;

import java.util.List;

public class Action {

	String actionName;
	String className;
	List<Forward> forwardActions;
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<Forward> getForwardActions() {
		return forwardActions;
	}
	public void setForwardActions(List<Forward> forwardActions) {
		this.forwardActions = forwardActions;
	}
	public Action(String actionName, String className, List<Forward> forwardActions) {
		super();
		this.actionName = actionName;
		this.className = className;
		this.forwardActions = forwardActions;
	}
	public Action() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
