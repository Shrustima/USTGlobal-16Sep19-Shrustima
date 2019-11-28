package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class EmpIdServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("empid"));
		
		PrintWriter out = resp.getWriter();
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//step1 load driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);         //or  Class.forName("com.mysql.jdbc.Driver");
			
			//step2 get connection
			conn = DriverManager.getConnection(url);
			
			//step3  issue sql querry
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			//step4  read the result
			if(rs.next()) {
				int emp_id = rs.getInt("id");
				int sal = rs.getInt("salary");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				out.println("Id : "+emp_id);
			    out.println("Name : "+name);
				out.println("Salary : "+sal);
				out.println("Gender : "+gender);
				out.println("*******************************");
				
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	
	
	}
}
