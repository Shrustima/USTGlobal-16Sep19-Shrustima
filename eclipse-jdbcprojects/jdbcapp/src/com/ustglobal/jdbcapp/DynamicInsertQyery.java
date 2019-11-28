package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;

import com.mysql.jdbc.Driver;
import java.sql.PreparedStatement;

public class DynamicInsertQyery {
	public static void main(String[] args) {

		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
			//step1 load the driver
			Driver driver = new Driver();
			DriverManager.deregisterDriver(driver);
			
			//step2   get connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step3   Issue SQL query
			//Dynamic querry
			String sql = "insert into employee_info values(?, ?,?,?)";
			//stmt = conn.createStatement();
			//int count = stmt.executeUpdate(sql);
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int salary = Integer.parseInt(empsal);
			pstmt.setInt(3, salary);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			
			
			//step4  Read the result
			System.out.println(count + " Row(s) inserted");
					
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//step5  close all JDBC objects
			try {
				if(conn!=null) {
					conn.close();
				}//if(stmt!=null) {
//					stmt.close();
//				}
					if(pstmt!=null) {
						pstmt.close();
					}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}//end main

}// end class
