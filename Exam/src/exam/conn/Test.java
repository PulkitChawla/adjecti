package exam.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
        System.out.println("In DB Connction class");
        try
        {
            Class.forName ("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection ("jdbc:mysql://localhost:3306/exam","root", "");
            System.out.println("Connection successfull");
        } 
        catch (Exception e)
        {
            System.out.println (e);
        }
        con.close();
        //return con;

	}

}
