package exam.user;

import java.sql.SQLException;

public class UserService 
{
	public static User getUserByLoginId(String userId,String pwd) throws SQLException {
		UserDao userDao=new UserDao();
		User u=userDao.getUser(userId, pwd);
		return u;
		
	}
}
