<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Implicit Object</title>
</head>
<body>
<%
 //request Object
  String userName = request.getParameter("name");
  System.out.println(userName);
  if(userName!=null){
  session.setAttribute("savedUserName",userName);
  application.setAttribute("savedUserName",userName);
  pageContext.setAttribute("PageContextUserName",userName,PageContext.APPLICATION_SCOPE);
  System.out.println("savedUserName " +(String) session.getAttribute("savedUserName"));
  }
  
  System.out.println("savedUserName " +(String) session.getAttribute("savedUserName"));
  String savedUserName =  (String) session.getAttribute("savedUserName");
 
%>

Hello!  <%=userName %> from request object.<br>
Hello!  <%=savedUserName %> from session object.<br>
Hello!  <%= (String) application.getAttribute("savedUserName") %> from application object.<br>
Hello!  <%= pageContext.getAttribute("PageContextUserName",PageContext.APPLICATION_SCOPE) %> from pageContext object.

</body>
</html>



