<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<h3>${msg}</h3>
	<div align="center">
		<form action="./login" method="Post">

			<table>
				<legend>Login Page</legend>
				<tr>
					<td><label> ID :</label></td>
					<td><input type="number" name="id"></td>
				</tr>

				<tr>
					<td><label>Password:</label></td>
					<td><input type="password" name="password"></td>
				</tr>


				<tr>
					<td><input type="submit" value="Login"></td>
					<td><input type="Reset" value="Reset"></td>
				</tr>
			</table>
		</form>
	</div>
	<div align="center">
		<a href="./register">Click here to register</a>
	</div>
</body>
</html>