package org.jdbcprct.JdbcApp;
import java.sql.*;
public class InsertMultiple {
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		String qry1="insert into Parker.student values(5,'Dinesh',88.95)";
		String qry2="insert into Parker.student values(6,'Ganesh',99.99)";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Admin");
			stmt=con.createStatement();
			stmt.executeUpdate(qry1);
			stmt.executeUpdate(qry2);
			System.out.println("Inserted");
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
