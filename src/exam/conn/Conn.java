package exam.conn;
import java.sql.*;

public class Conn 
{
	public static Connection getConnection() {
		Connection con = null;
        System.out.println("In DB Connction class");
        try
        {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection ("jdbc:mysql://localhost:3305/exam","root", "Pulkit@123");
            System.out.println("Connection successfull");
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;
	}
}
