package com.ustglobal.empwebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlett extends HttpServlet
{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
   {
	   int id = Integer.parseInt(req.getParameter("id"));
	   String password = req.getParameter("password");
	   String rememberMe = req.getParameter("rememberMe");
	   if(rememberMe == null)
	   {
		   Cookie[] cookies = req.getCookies();
		   for(Cookie cookie : cookies)
		   {
			   if(cookies.getName().equals("always remember"))
			   {
				   cookie
			   }
		   }
	   }
	   
	}
}
