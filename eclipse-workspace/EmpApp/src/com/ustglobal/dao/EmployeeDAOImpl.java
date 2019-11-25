package com.ustglobal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.eempapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements  EmployeeDAO  {
	public List<EmployeeBean> getAllEmployeeData() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;

		String url = "jdbc:mysql://localhost:3306/employee1?user=root&password=root";
		String sql = "select * from employee1";

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			ArrayList<EmployeeBean> result1 = new ArrayList<EmployeeBean>();
			while (rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id = rs.getInt("id");
				bean.setId(id);
				String name = rs.getString("name");
				bean.setName(name);
				int sal = rs.getInt("sal");
				bean.setSal(sal);
				String gender = rs.getString("gender");
				bean.setGender(gender);

				result1.add(bean);

		}
			return result1;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		} finally {
			// Step 5 CLose all JDBC Objects
			try {

				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				 if(rs!=null)
				 {
				 rs.close();
				 }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}// end of main

//// End of MyFirstJDBC

	public EmployeeBean searchEmployeeData(int id) {
		String url = "jdbc:mysql://localhost:3306/employee1?user=root&password=root";
		String sql = "select * from employee1 where id = ? ";

		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				return bean;
			} else {
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			// Step 5 CLose all JDBC Objects
			try {

				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();

			}
		}

	}

	@Override
	public int insertEmployeeData(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployeeData(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployeeData(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
}
