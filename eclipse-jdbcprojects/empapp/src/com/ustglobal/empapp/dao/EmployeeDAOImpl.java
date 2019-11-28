package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;
import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	public List<EmployeeBean> getAllEmployeeData() {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			ArrayList<EmployeeBean> result = new ArrayList<>();
			
			while(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id = rs.getInt("id");
				bean.setId(id);
				String name = rs.getString("name");
				bean.setName(name);
				int salary = rs.getInt("salary");
				bean.setSalary(salary);
				String gender = rs.getString("gender");
				bean.setGender(gender);
				
				result.add(bean);
			}
			return result;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(conn!=null) {
				conn.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
			if(rs!=null) {
				rs.close();
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	public EmployeeBean searchEmployeeData(int id) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSalary(rs.getInt("salary"));
				bean.setGender(rs.getString("gender"));
				return bean;
			}else {
				return null;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
	public int deleteEmloyeeData(int id) {
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
			pstmt.setInt(1, id);
			 //pstmt.setInt(1,Integer.parseInt(args[0]));
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
		return id;

	}
	
	public EmployeeBean updateEmployeeData(EmployeeBean bean) {
		
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
			
//			String empid = args[0];
//			int id = Integer.parseInt(empid);
//			
//			String name = args[1];
//			
//			String empsal = args[2];
//			int salary = Integer.parseInt(empsal);
//			
//			String gender = args[3];
			
//			pstmt.setInt(4, id);     //index according to query
//			pstmt.setString(1, name);
//			pstmt.setInt(2, salary);
//			pstmt.setString(3, gender);
//			
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
		//return 0;
		return bean;
		
	}
}
