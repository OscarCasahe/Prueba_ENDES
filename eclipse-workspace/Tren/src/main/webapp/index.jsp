<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@tagLib prefix="fmt" url="http://java.sun.com/jstl/fmt_rt" %>
<%@tagLib prefix="c" url="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
</head>
<body>

<c:if test="${tren.maquinista.nombre eq 'Pepe'}">
	<p style="color:red">"${tren.maquinista.nombre}"</p>
</c:if>


	<p>${tren.maquinista.nombre}</p>
	<p>${tren.maquinista.apellidos}</p>

<ul>
	<c:forEach items="${tren.vagones}" var="items">
		<li>Longitud:${item.longitud} Capacidad:${item.capacidad}</li>
	</c:forEach>
</ul>



</body>
</html>