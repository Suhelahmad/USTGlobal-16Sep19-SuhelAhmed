<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="obj" class="com.ustglobal.webapp.servlets.SetRequestAttributeServlet" scope="application"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
<h2><%=obj.getId()%></h2>
<h2><%=obj.getName()%></h2>
</body>
</html>