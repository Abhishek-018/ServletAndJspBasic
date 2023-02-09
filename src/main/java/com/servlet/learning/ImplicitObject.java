package com.servlet.learning;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ImplicitObject
 */
@WebServlet("/ImplicitObjectPath")
public class ImplicitObject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter(); 
		
		String userName = request.getParameter("name");
		 HttpSession session = request.getSession();
		 if(userName != "" && userName != null) {
		 session.setAttribute("savedUserName",userName);
		 System.out.println((String) session.getAttribute("savedUserName"));
		 }
		 
		 out.println("<b>Hi!</b>" +(String) session.getAttribute("savedUserName"));
		 
		
	}

}
