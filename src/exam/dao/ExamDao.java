package exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import exam.conn.Conn;
import exam.pojo.Exam;

public class ExamDao {
	public String save(Exam e) {
		int status = 0;
		try {
			Connection con = Conn.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into eadd(eid,ename,edesc) values (?,?,?)");
			ps.setInt(1, e.getExamId());
			ps.setString(2, e.getExamName());
			ps.setString(3, e.getExamDesc());
			ps.executeUpdate();
		} catch (Exception ex) {

			ex.printStackTrace();
		}
		if (status != 0) {
			return "Exam added";
		} else {
			return "Error!!!!";
		}
	}

	public static int delete(int id) {
		int status = 0;
		try {
			Connection con = Conn.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from eadd where eid=?");//'+id+'
			System.out.println("Record Dleted"+ps);
			ps.setInt(1, id);
			status = ps.executeUpdate();
			//con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static List<Exam> getAllExams() {
		List<Exam> list = new ArrayList<Exam>();
		try {
			Connection con = Conn.getConnection();

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from eadd");

//	            PreparedStatement ps = con.prepareStatement ("select * from eadd");
//	            ResultSet rs = ps.executeQuery ();
			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				String desc = rs.getString(3);
				Exam e = new Exam(id, name, desc);
				System.out.println("id: "+id);
				System.out.println("name: "+name);
				System.out.println("desc: "+desc);
				e.setExamId(rs.getInt(1));
				e.setExamName(rs.getString(2));
				e.setExamDesc(rs.getString(3));
				list.add(e);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static int update(Exam exam) {
		int status = 0;
		try {
			Connection con = Conn.getConnection();
			PreparedStatement ps = con.prepareStatement("update eadd set ename=?,edesc=? where eid=?");
			
			ps.setInt(3, exam.getExamId());
			ps.setString(1, exam.getExamName());
			ps.setString(2, exam.getExamDesc());
			status=ps.executeUpdate();
			if(status>0) {
			System.out.print("Record Updated Successfully");
			}
			else {
				System.out.println("Error Occured");
			}
//			ps.setInt(1, exam.getExamId());
//			ps.setString(2, exam.getExamName());
//			ps.setString(3, exam.getExamDesc());
			
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return status;
	}
	
	public static Exam searchById(int id) {
		Exam exam=null;
		if(id!=0) {
			try {
				Connection con=Conn.getConnection();
				PreparedStatement ps=con.prepareStatement("select * from eadd where eid='"+id+"'");
				//int a=Integer.parseInt(ps.setInt(1, id));

				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					int eid=rs.getInt(1);//int eid
					String ename=rs.getString(2);
					String edesc=rs.getString(3);
					exam=new Exam(eid,ename,edesc);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Please enter ID");
		}
		
		return exam;
	}

}
