package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single employee data");
		
		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();
		
		switch(ch) {
		
		case 1: 
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
			
			for(EmployeeBean bean : result) {
				System.out.println("Name: "+bean.getName());
				System.out.println("Id: "+bean.getId());
				System.out.println("Gender: "+bean.getGender());
				System.out.println("Salary: "+bean.getSalary());
			}
			
			break;
			
		case 2:	
			EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter employee id ");
			int id2 = scn.nextInt();
			EmployeeBean bean2 = dao2.searchEmployeeData(id2);
			if(bean2!=null) {
				System.out.println("Name: "+bean2.getName());
				System.out.println("Id: "+bean2.getId());
				System.out.println("Gender: "+bean2.getGender());
				System.out.println("Salary: "+bean2.getSalary());

			}else {
				System.out.println("No data found");
			}
						break;
		case 3:	
			break;
		case 4:
			break;
		case 5: 
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter employee id ");
			int id = scn.nextInt();
			EmployeeBean bean = dao5.searchEmployeeData(id);
			if(bean!=null) {
				System.out.println("Name: "+bean.getName());
				System.out.println("Id: "+bean.getId());
				System.out.println("Gender: "+bean.getGender());
				System.out.println("Salary: "+bean.getSalary());

			}else {
				System.out.println("No data found");
			}
		
		}//end switch
	}//end main
}//end class
