package com.ustglobal.assignmenthibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdate {

public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//step1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step2   get connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step3   Issue SQL query
			String sql = "update  employee_info set name='ABC', salary=50000, gender = 'F' where id=2" ;
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//step4  Read the result
			System.out.println(count + " Row(s) updated");
					
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
	}

}
