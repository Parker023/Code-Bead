package org.jdbcprct.JdbcApp;
import java.sql.*;
import java.util.Scanner;
public class GetData {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String qry=sc.nextLine();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Admin");
			pstmt=con.prepareStatement(qry);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				double perc=rs.getDouble(3);
				System.out.println("Id: "+id+" name: "+name+" perc: "+perc);
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
