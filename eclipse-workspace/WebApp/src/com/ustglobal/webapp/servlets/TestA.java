package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestA extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String empId = req.getParameter("empId");
		String url = "jdbc:mysql://localhost:3306/employee1?"+"user=root&password=root";
		String sql = "select * from employee1 where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PrintWriter out = resp.getWriter();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empId);
			rs = pstmt.executeQuery();
			
			
			out.println("<table>");
			out.println("<thead>");
			out.println("<th>Id</th>");
			out.println("<th>Name</th>");
			out.println("<th>Salary</th>");
			out.println("<th>Gender</th>");
			out.println("</thead>");
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td>");
				out.println(rs.getInt(1));
				out.println("</td>");
				
				out.println("<td>");
				out.println(rs.getString(2));
				out.println("</td>");
				
				out.println("<td>");
				out.println(rs.getInt(3));
				out.println("</td>");
				
				out.println("<td>");
				out.println(rs.getString(4));
				out.println("</td>");
				
				out.println("</tr>");
							
			}
			out.println("</table>");
		}
			catch(SQLException | ClassNotFoundException e)
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
					 
				}catch (Exception e1)
				{
					e1.printStackTrace();		
				}
			}
				
		}
}