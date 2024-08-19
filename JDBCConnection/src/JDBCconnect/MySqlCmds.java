package JDBCconnect;
import java.sql.*;
public class MySqlCmds {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","Nte#25");
		Statement stmt = conn.createStatement();
		String s="insert into book_detl values('CS004','MicronTesting','AI','Raji','Oxford','S',2024,999.00)";
		stmt.execute(s);
		conn.close();
		System.out.println("Statement got executed");
		

	}

}
