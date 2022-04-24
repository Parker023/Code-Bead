package org.jdbcprct.JdbcApp;
import java.sql.*;
public class InsertDemo {
public static void main(String[] args)
{
	Connection con=null;
	Statement stmt=null;
	String qry="insert into Parker.student values(4,'Vishnu',88.95)";
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Admin");
		stmt=con.createStatement();
		stmt.executeUpdate(qry);
	} 
	catch (ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
	}	
	finally {
		if(stmt!=null) 
		{
			try
			{
				stmt.close();
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		if(con!=null)
		{
			try {
				con.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
}
