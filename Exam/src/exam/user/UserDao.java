package exam.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import exam.conn.Conn;

public class UserDao 
{
	User user;
	public User getUser(String userId,String pwd) throws SQLException {
		Connection con=Conn.getConnection();
		String sql="select * from user where userId=? and pwd=? ";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,userId );
		ps.setString(2,pwd);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			String id=rs.getString(2);
			String name=rs.getString(3);
			String pass=rs.getString(4);
			//user=new User();
			user=new User(id,name,pass);
		}
		return user;
	}
	
}
