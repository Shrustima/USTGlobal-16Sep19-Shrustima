package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {
public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//step1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step2   get connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step3   Issue SQL query
			String sql = "update  employee_info set name=?, salary=?, gender = ? where id=?" ;
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			
			String empsal = args[2];
			int salary = Integer.parseInt(empsal);
			
			String gender = args[3];
			
			pstmt.setInt(4, id);     //index according to query
			pstmt.setString(1, name);
			pstmt.setInt(2, salary);
			pstmt.setString(3, gender);
			
			int count = pstmt.executeUpdate();
			
			
			
			//step4  Read the result
			System.out.println(count + " Row(s) updated");
					
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//step5  close all JDBC objects
			try {
				if(conn!=null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
