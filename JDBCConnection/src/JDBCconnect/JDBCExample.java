package JDBCconnect;
import java.sql.*;



public class JDBCExample {
	static final String DBURL= "jdbc:mysql://127.0.0.1:3306/student";
	static final String User="root";
	static final String PASS="Nte#25";
	static final String QUERY="select book_no,title,sub_code,author from book_detl";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection conn=DriverManager.getConnection(DBURL,User,PASS);
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(QUERY);
				){
			while(rs.next())
			{
				System.out.println("Book no :"+rs.getString("book_no"));
				System.out.println("Title: "+rs.getString("title"));
				System.out.println("Subject Code: "+rs.getString("sub_code"));
				System.out.println("author: "+rs.getString("author"));
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
