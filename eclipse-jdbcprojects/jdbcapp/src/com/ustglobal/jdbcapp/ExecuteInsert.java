package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsert {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		
		try {
			//step1 load the driver
			Driver driver = new Driver();
			DriverManager.deregisterDriver(driver);
			
			//step2   get connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step3   Issue SQL query
			String sql = "insert into employee_info values(7, 'nikita',14000,'F')";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//step4  Read the result
			System.out.println(count + " Row(s) inserted");
					
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//step5  close all JDBC objects
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}//end main

}//end class
