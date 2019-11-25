package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;
import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;

public class SearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		HttpSession session = req.getSession(false);
		if(session==null)
		{
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
			dispatcher.forward(req, resp);
		}
		int id = Integer.parseInt(req.getParameter("id"));
		
		EmployeeDAO dao = EmployeeDAOManager.getEmployeeDAO();
		EmployeeInfo info = dao.searchEmployee(id);
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<a href='./home'>Home</a>");
		out.println("<a style='float:right' href='#'>Logout</a>");
		
		if(info!=null)
		{
		out.println("<table align='center'>");
		out.println("<tr>");
		out.println("<th>Id<th><th>Name<th><th>Email<th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println(info.getId());
		out.println("</td>");
		out.println(info.getName());
		out.println("</td>");
		out.println(info.getEmail());
		out.println("</td>");
		out.println("</tr>");

		out.println("</table>");
		}else
		{
			out.println("no data found");
		}
		out.println("</td>");
		out.println("</body>");
		out.println("</html>");

//		int id = Integer.parseInt(req.getParameter("id"));
//		
//		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
//		EmployeeInfo info = dao.searchEmployee(id);
//		
//		if(info == null) {
//			
//			PrintWriter out = resp.getWriter();
//			out.println("<html>");
//			out.println("<h4 style='color=Red'>Invalid ID</h4>");
//			out.println("</html>");
//			
//			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
//			dispatcher.include(req, resp);
//		} else {
//			RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
//			dispatcher.forward(req, resp);
//		}
	}
}
