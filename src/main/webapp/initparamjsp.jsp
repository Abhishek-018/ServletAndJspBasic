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
public void jspint(){
	String user =  getServletConfig().getInitParameter("DefaultUser");
	ServletContext application = getServletContext();
	application.setAttribute("savedConextUserName",user);
}

%>
 Default Username from web.xml initparam jsp config is:  <%= getServletConfig().getInitParameter("DefaultUser")%>
 Default Servlet Context is:  <%= application.getAttribute("savedConextUserName")%>
 </body>
</html>