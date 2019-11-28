package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

//import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//step1
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
//			or we can do like this
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//step2
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "delete from employee_info where id=?";
			pstmt = conn.prepareStatement(sql);
			 pstmt.setInt(1,Integer.parseInt(args[0]));
			//or      int id = Integer.parseInt(args[0);    dont write string empid=.........
			
//			String name = args[1];
//			
//			String empsal = args[2];
//			int salary = Integer.parseInt(empsal);
//			
//			String gender = args[3];

			
			//pstmt.setInt(4, id);     //index according to query
//			pstmt.setString(1, name);
//			pstmt.setInt(2, salary);
//			pstmt.setString(3, gender);
			
			int count = pstmt.executeUpdate();
			
			System.out.println(count + " Rows deleted");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
