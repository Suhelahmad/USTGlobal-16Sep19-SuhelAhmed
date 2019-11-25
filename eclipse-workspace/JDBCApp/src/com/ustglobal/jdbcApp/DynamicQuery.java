package com.ustglobal.jdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

public class DynamicQuery 
{
	public static void main(String[] args)
	{
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		try {
			//Step 1 load the driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//Step 2 Get the Connection
		String url = "jdbc:mysql://localhost:3306/employee1";
		conn = DriverManager.getConnection(url,"root","root");
		
		//Step 3 Issue sql query
			String sql = "insert into employee1 values(?,?,?,?)";
			
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			
			//Step 4 Read the Result
			System.out.println(count + " Row(s) inserted");
			
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
				  if(rs!=null)
				  {
					  rs.close();
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
