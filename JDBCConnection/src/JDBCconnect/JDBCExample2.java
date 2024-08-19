package JDBCconnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","Nte#25");
		Statement stamt = conn.createStatement();
		String s ="SELECT * from book_detl;";
		ResultSet rs = stamt.executeQuery(s);
		while(rs.next()) {
			String id = rs.getString("book_no");
		    String tt = rs.getString("title");
		    String subc = rs.getString("sub_code");
		    String author = rs.getString("author");
		    String pb= rs.getString("publisher");
		    String status = rs.getString("status");
		    String yop = rs.getString("yop");
		    String pc = rs.getString("price");
		    System.out.println("Book_no: " + id + ", Title: " + tt+ ", Subject_code: " + subc + ", aut: " + author + ", pub: " + pb + ", sts: " + status + ", yop: " + yop + ", prc: " + pc);
		}
		conn.close();
		System.out.println("Statement Executed : Query executed......");
	}
		

	}


