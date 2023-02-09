<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date And Time jsp</title>
</head>
<body>
<%@ include file = "/includefile.jsp" %>
<b> Current Date And Time is:
<% Date date = new Date(); 
   
%>

<%= date %></b>
</body>
</html>