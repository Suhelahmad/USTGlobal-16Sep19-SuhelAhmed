package com.ustglobal.phoneapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class PhoneDAOImpl {
	String url="jdbc:mysql://localhost:3306/ContactFile";
	String showSql="select * from contact";
	String searchSql="select * from contact where Name=?";
	String insertSql="insert into contact values(?,?,?)";
	String deleteSql="delete from contact where Name=?";
	String updateSql="update contact Number=?, GropuName=? where Name=?";
	public void showAll() {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ContactFile?"+"user=root&password=root");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(showSql)) {
					while (rs.next()) {
						System.out.println("Name="+rs.getString("Name"));
						System.out.println("Number="+rs.getInt("Number"));
						System.out.println("GropuName="+rs.getString("GropuName"));
						System.out.println("==========================================");
					}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void search(String Name) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ContactFile?"+"user=root&password=root");
					PreparedStatement st=con.prepareStatement(searchSql) ){
					st.setString(1, Name);					
					try(ResultSet rs=st.executeQuery()) {
						Scanner sc=new Scanner(System.in);
						if(rs.next()) {
							String Name1=rs.getString("Name");
							System.out.println("press 1 to call "+Name1);
							System.out.println("press 2 to message "+Name1);
							System.out.println("press 3 to go back main menu");
							int i=sc.nextInt();
							switch (i) {
							case 1:
								System.out.println("calling to "+Name);
								System.out.println("press any key to end call");
								try {
									System.in.read();
								} catch (Exception e) {
									e.printStackTrace();
								}
								break;
							case 2:
								System.out.println("messaging to "+Name);
								break;
							case 3:
								break;
							default:
								System.out.println("invalid choice");
								break;
							}
						}else {
							System.out.println("name not found");
						}
					} catch (Exception e) {

						e.printStackTrace();
					}
				
					}catch (Exception e) {
						e.printStackTrace();
					}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	public void operateOnCon() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ContactFile?"+"user=root&password=root")) {
					System.out.println("press 1 add contact");
					System.out.println("press 2 delete contact");
					System.out.println("press 3 edit contact");
					Scanner sc=new Scanner(System.in);
					int ch=sc.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter Name");
						String name=sc.next();
						System.out.println("Enter Number");
						long num=sc.nextLong();
						System.out.println("Enter Gorup");
						String group=sc.next();
						try(PreparedStatement pst=con.prepareStatement(insertSql)) {
							pst.setString(1, name);
							pst.setLong(2, num);
							pst.setString(3, group);
							int i=pst.executeUpdate();
							System.out.println(i+" rows inserted");
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					case 2:
						System.out.println("enter name to delete from contact");
						
						String name1=sc.next();
						try(PreparedStatement pst=con.prepareStatement(deleteSql)){
							pst.setString(1, name1);
							int delete=pst.executeUpdate();
							System.out.println(delete+" rows deleted");
						}catch (Exception e) {
							e.printStackTrace();
						}
						break;
					case 3:
						System.out.println("enter name for update");
						String name2=sc.next();
						System.out.println("enter number for change existing number");
						long Number=sc.nextInt();
						System.out.println("Enter group name for change existing group");
						String groups=sc.next();
						try(PreparedStatement pst=con.prepareStatement(updateSql)){
							pst.setLong(1, Number);
							pst.setString(2, groups);
							pst.setString(3, name2);
							
							int update = pst.executeUpdate();
							System.out.println(update+" rows updated");
						}catch (Exception e) {
						e.printStackTrace();
						}
					default:
						System.out.println("invalid choice");
						break;
					}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
