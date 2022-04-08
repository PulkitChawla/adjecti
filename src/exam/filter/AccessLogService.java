package exam.filter;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exam.conn.Conn;

public class AccessLogService {
	
	public static void service(String ip,String date_and_time,String uri) {
		
		try (Connection con = Conn.getConnection()) {
		String query = "INSERT INTO rec(ip, time, url) VALUES (?, ?, ?)";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, ip);
		statement.setString(2, date_and_time);
		statement.setString(3, uri);
		
		int i=statement.executeUpdate();

	}
catch(Exception e) {
			
		}
	}
}
