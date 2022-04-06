package exam.servlet;

public class MethodList {
	private String methodName;
	private String methodpath;
	
	public MethodList() {
		super();
		
	
	}
	public MethodList(String methodName, String methodpath) {
		super();
		this.methodName = methodName;
		this.methodpath = methodpath;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getMethodpath() {
		return methodpath;
	}
	public void setMethodpath(String methodpath) {
		this.methodpath = methodpath;
	}
	@Override
	public String toString() {
		return "MethodList [methodName=" + methodName + ", methodpath=" + methodpath + "]";
	}
	
	
	
	
}
