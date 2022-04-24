package org.jdbcprct.JdbcApp;

import java.sql.*;
import java.util.Scanner;

public class IntegratedCode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String query="select name from Parker.student where id=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Admin");
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));//Buffer memory col num
//				System.out.println(rs.getDouble(3));
			}
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
			sc.close();
		}
	}
}
