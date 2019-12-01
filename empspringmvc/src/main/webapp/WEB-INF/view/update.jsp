<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home" style="float: left;">Home</a>
<a href="./logout" style="float: right;">Logout</a>
	<fieldset>
	<div align="center">
		<form action="./update" method="Post">

			<table>
				<legend>Update Profile</legend>
				
				<tr>
					<td><label>Name:</label></td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td><label>Password:</label></td>
					<td><input type="password" name="password"></td>
				</tr>
				
				
				<tr>
					<td><label>DOJ:</label></td>
					<td><input type="date" name="doj"></td>
				</tr>
				<tr>
				<td><label>Gender</label></td>
					<td>
					<select name="gender" required="required">
					<option>----select-----</option>
					<option value="M">Male</option>
					<option value="F">Female</option>
					
					</select>
					
					</td>
				</tr>
		<tr>
					<td><input type="submit"  value="Update"></td>
					<td><input type="Reset" value="Reset"></td>
				</tr>
			</table>
		</form>
	</div>
</fieldset>
	
</body>
</html>