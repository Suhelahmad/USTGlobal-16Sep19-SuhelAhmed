package com.ustglobal.EmpApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.dao.EmployeeDAO;
import com.ustglobal.dao.EmployeeDAOImpl;
import com.ustglobal.eempapp.dto.EmployeeBean;
import com.ustglobal.empappp.utill.EmployeeManagerr;


public class App 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to get insert employee data");
		System.out.println("Press 3 to get upadte employee data");
		System.out.println("Press 4 to get delete employee data");
		System.out.println("Press 5 to search single employee data");
		
		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();
		
		switch (ch) {
		case 1:
			EmployeeDAO daol = EmployeeManagerr .getEmployeeDAO();
			List<EmployeeBean> result = daol.getAllEmployeeData();
			
			for(EmployeeBean bean : result) {
				 System.out.println("Id is:" +bean.getId());
					System.out.println("Name is:" +bean.getName());
					System.out.println("salary is:" +bean.getSal());
					System.out.println("Gender is:" +bean.getGender());
				
			}
			break;
			
		case 2:
			break;
			
		case 3:
			
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			 EmployeeDAO dao5 = EmployeeManagerr.getEmployeeDAO();
			 System.out.println("Enter the Employee Id...");
			 int id = scn.nextInt();
			 EmployeeBean bean = dao5.searchEmployeeData(id);
			 if(bean!=null)
			 {
				 System.out.println("Id is:" +bean.getId());
					System.out.println("Name is:" +bean.getName());
					System.out.println("salary is:" +bean.getSal());
					System.out.println("Gender is:" +bean.getGender());
			 }else {
				 System.out.println("No data found");
			 }
			break;
		}
	}
}
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		
//		String url = "jdbc:mysql://localhost:3306/employee1?user=root&password=root";
//		String sql = "select into employee1";
//		
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			conn=DriverManager.getConnection(url);
//			stmt = conn.createStatement();
//			
//			rs = stmt.executeQuery(sql);
//			
//			while(rs.next())
//			{
//				System.out.println("Id is:" +rs.getInt("id"));
//				System.out.println("Name is:" +rs.getString("name"));
//				System.out.println("salary is:" +rs.getInt("salary"));
//				System.out.println("Gender is:" +rs.getString("gender"));
//				
//			}
//			
//		} 
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		finally {
//			//Step 5 CLose all JDBC Objects
//			 try {
//				 
//				  if(conn!=null)
//				  {
//					  conn.close();
//				  }
//				  if(stmt!=null)
//				  {
//					  stmt.close();
//				  }
//				  if(rs!=null)
//				  {
//					  rs.close();
//				  }
//			  }
//			 catch(Exception e)
//			 {
//				 e.printStackTrace();
//			 }
//		}
//		
//	}// end of main
//
//}//// End of MyFirstJDBC
