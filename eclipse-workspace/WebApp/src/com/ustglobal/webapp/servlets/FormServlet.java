package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	
		ServletContext context = getServletContext();
		String companyname = context.getInitParameter("company-name");
		

		ServletConfig config = getServletConfig();
		String batchname = config.getInitParameter("batch-name");
		
		
		
		String empName = req.getParameter("empname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		out.println("<h1>");
		out.println(empName);
		out.println("</h1>");
		
		out.println("<h1>");
		out.println(email);
		out.println("</h1>");
		
		
		out.println("<h1>");
		out.println(password);
		out.println("</h1>");
		
		out.println("<h2>");
		out.println(companyname);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(batchname);
		out.println("</h2>");
		
		out.println("</body>");
		out.println("</html>");
		
		
	}// end of doGet()
}//end of FormServlet
