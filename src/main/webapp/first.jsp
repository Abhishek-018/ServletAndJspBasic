<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First jsp</title>
</head>
<body>
<h1>Hello From first.jsp</h1>

<%!
//Declaration tag
public int add(int number1,int number2){
	int sum = number1 + number2;
	return sum;
}

%>

<%
//Scriplet tag--> jspService() get invoked after the tag is encountered
int num1 = 10;
int num2 = 8;

int sum = num1 + num2;


%>
Value of sum is : 
<%=
//Expression tag
sum 
%>

<br>

Value of sum from main method:
<%=

add(100,300)

%>
<br>Default Username from web.xml initparam jsp config is:  <%= getServletConfig().getInitParameter("DefaultUser")%>
</body>
</html>