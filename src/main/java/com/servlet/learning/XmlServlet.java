package com.servlet.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class XmlServlet extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from doGet()");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("userName");
		
		//For Session Storage
		
		HttpSession sessionObject = request.getSession();
		ServletContext contextObject = request.getServletContext();
		if(userName != "" && userName != null) {
			sessionObject.setAttribute("savedUserName", userName);
			contextObject.setAttribute("savedUserName",userName);
			
		}
		
		String savedUserName = (String) sessionObject.getAttribute("savedUserName");
		String savedContextUserName = (String) contextObject.getAttribute("savedUserName");
		
		writer.println("From request parameter hello: " +userName);
		
		writer.println("<br>From session parameter hello: " +savedUserName);
		
		writer.println("<br>From context parameter hello: " +savedContextUserName);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from XmlServelt()");
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Player Details:</h3>");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String jerseyNumber = request.getParameter("jerseyNumber");
		String designation = request.getParameter("designation");
		String location = request.getParameter("location");
		
		//To store multiple values in request object
		String choresArray[]= request.getParameterValues("chores");
		
		writer.println("First Name: " +firstName +"<br>");
		writer.println("Last Name: " +lastName +"<br>");
		writer.println("Jersey Number: " +jerseyNumber +"<br>");
		writer.println("Chores Completed: " +choresArray.length +"<br>");
		for(String chores:choresArray) {
			writer.println(chores +"<br>");
		}
		writer.println("<br>"+ "Designation: "  +designation +"<br>");
		writer.println("Current Match Location: "  +location +"<br>");
		
		
	}
	
	 @Override
	 public void init() throws ServletException {
	        System.out.println("This is init()");
	    }
	

}
