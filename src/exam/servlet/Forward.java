package exam.servlet;

public class Forward {

	private String key;
	private String page;
	
	public Forward() {
		
	}
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	
	public Forward(String key, String page) {
		super();
		this.key = key;
		this.page = page;
	}
}
