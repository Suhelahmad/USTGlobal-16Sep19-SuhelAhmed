<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<%
String id = "";
Cookie[] cookies = request.getCookies();
if(cookies!=null)
{
	for(Cookie cookie : cookies)
	{
		if(cookie.getName().equals("always remember"))
		{
			id = cookie.getValue();	
		}
	}
}
%>
<body>
<h4><%=msg%>></h4>
<fieldset align='center'>




</fieldset>
</body>
</html>