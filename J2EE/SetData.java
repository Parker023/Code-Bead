package org.jdbcprct.JdbcApp;

import java.sql.*;

public class SetData {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	String qry="insert into Parker.student values(?,?,?)";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Admin");
		pstmt=con.prepareStatement(qry);
		pstmt.setInt(1, 7);
		pstmt.setString(2, "Dilli");
		pstmt.setDouble(3, 85.23);
		pstmt.executeUpdate();
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	finally {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt!=null) {
			try {
				pstmt.close();
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
