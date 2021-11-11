<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hola Mundo JSP</title>
</head>
<body>
	<h3>La hora es <%= new Date() %></h3>
	
	<% 
	response.getWriter().println("<ul>");
	
	for(int i=0;i<100;i++){
	out.println("<li>"+i+"</li>");
	}
	response.getWriter().println("</ul");
	%>
</body>
</html>