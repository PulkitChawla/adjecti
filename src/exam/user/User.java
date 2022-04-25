package exam.user;

public class User 
{
	private int id;
	private String userId;
	private String name;
	private String pwd;
	
	public User() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public User(String userId, String name, String pwd) {
		super();
		this.userId = userId;
		this.name = name;
		this.pwd = pwd;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", name=" + name + ", pwd=" + pwd + "]";
	}

	
}
