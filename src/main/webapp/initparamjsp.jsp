<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!

public void jspInit() {
	String defaultUser =  getServletConfig().getInitParameter("defaultUser");
	ServletContext application = getServletContext();
	application.setAttribute("defaultUser",defaultUser);
}

%>
 Default Username from web.xml initparam jsp config is:  <%= getServletConfig().getInitParameter("defaultUser")%>
 <br>Value of Servlet Context is:  <%= getServletContext().getAttribute("savedConextUserName")%>
 </body>
</html>