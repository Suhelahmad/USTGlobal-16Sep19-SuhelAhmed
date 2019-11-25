package com.ustglobal.FileHandling;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;


public class MyFirstJDBCWithProperties {

	public static void main(String[] args) 
	{
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;

			try {
			reader = new FileReader("Text.properties");
			Properties pro = new Properties();
			pro.load(reader);
			
			//Step 1 Load Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step 2 Get the connection
			String url = pro.getProperty("url");
			con = DriverManager.getConnection(url,pro);
			
			//Step 3 Issue the SQL Query
			stmt = con.createStatement();
			String sql = "select *from employee1";
			
			rs = stmt.executeQuery(sql);
			
			//Step 4 Read the Result
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int  sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("Id = "+id);
				System.out.println("Name= "+name);
				System.out.println("Salary = "+sal);
				System.out.println("Gender = "+gender);
				System.out.println("********************");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//Step 5 CLose all JDBC Objects
			 try {
				 
				  if(con!=null)
				  {
					  con.close();
				  }
				  if(stmt!=null)
				  {
					  stmt.close();
				  }
				  if(rs!=null)
				  {
					  rs.close();
				  }
			  }
			 catch(Exception e2)
			 {
				 e2.printStackTrace();
			 }
		
		
	}// end of main

	}
}//// End of MyFirstJDBC

