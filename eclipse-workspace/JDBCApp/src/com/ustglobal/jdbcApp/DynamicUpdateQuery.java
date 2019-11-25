package com.ustglobal.jdbcApp;

import java.sql.DriverManager;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery
{
	public static void main(String[] args)
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//Step 1 load the driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//Step 2 Get the Connection
		String url = "jdbc:mysql://localhost:3306/employee1";
		conn = DriverManager.getConnection(url,"root","root");
		
		//Step 3 Issue sql query
			String sql = "update employee1 set name=?, sal=?,gender=? where id=?";
			
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			
			String gender = args[3];
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);
			
			int count = pstmt.executeUpdate();
			
			//Step 4 Read the Result
			System.out.println(count + " Row(s) Updated");
			
			
			
		}catch (SQLException e)
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
				  
			}catch (SQLException e1)
			{
				e1.printStackTrace();		
			}
		}
	}//end of main
} // end of DynamicQuery
