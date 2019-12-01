<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="./home">Home</a>
<a href="./logout" style="float: right;">Logout</a>

	<div align="center">
		<form action="./changepassword" method="post">

			<table>
				<legend>Change Password Here</legend>
				<tr>
					<td><label>New Password :</label></td>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					<td><label>Confirm Password:</label></td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>


				<tr>
					<td><input type="submit" value="Change"></td>
					<td><input type="Reset" value="Reset"></td>
				</tr>
			</table>
		</form>
	</div>
	
</body>
</html>