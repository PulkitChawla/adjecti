package exam;

import java.util.List;

public class Action {

	private String actionName;
	private String actionClass;
	private List<Forward> forwardAction;
	
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
	public List<Forward> getForwardAction() {
		return forwardAction;
	}
	public void setForwardAction(List<Forward> forwardAction) {
		this.forwardAction = forwardAction;
	}
}