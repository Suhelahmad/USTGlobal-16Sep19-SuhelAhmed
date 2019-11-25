package com.ustglobal.jdbcApp;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Driver;

public class DynamicSelectQuery
{
	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306/employee1?"+"user=root&password=root";
		String sql = "select * from employee1 where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//Step 1 load drivers
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step 2 Get the Connection
			conn = DriverManager.getConnection(url);
			
			//step 3 Issue SQL Query
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			//Step 4 Read the Result
			if(rs.next())
			{
				int emp_id = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				System.out.println("Id is = " +id);
				System.out.println("Name is = " +name);
				System.out.println("Salary is = " +sal);
				System.out.println("Gender is = " +gender);
				System.out.println("*********************************");
				
			}
			
		}catch(SQLException e)
		{
			
			e.printStackTrace();		
		}finally {
			//Step 5 close all JDBC Objects
			try {
				if(conn!=null)
				  {
					  conn.close();
				  }
				 if(pstmt!=null)
				  {
					  pstmt.close();
				  }
				  
				  if(rs!=null)
				  {
					  rs.close();
				  }
				 
			}catch (SQLException e1)
			{
				e1.printStackTrace();		
			}
		}
			
		}
	}

