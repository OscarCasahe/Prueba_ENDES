<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if(request.getParameter("usuario").equals("admin") && request.getParameter("password").equals("admin")) {
		%>
				<jsp:formward page="admin.jsp" />
			
	<% } else if(request.getParameter("usuario").equals("usuario") && request.getParameter("password").equals("usuario")) {
%>
			<jsp:formward page="usuario.jsp" />
			
			
<% }else { %>
				<jsp:formward page="login.jsp" />
		
	
</body>
</html>