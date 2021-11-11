<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:setBundle basename="interface" />    
<jsp:include page="include/bootstrap.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Actualización del ProdcutLine</title>
</head>
<body>
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-6 mt-5">
				<form method="post">
					<label for="pl" class="form-label">ProductLine</label>
    				<input name="pl" value="${pago.customerNumber}" type="text" class="form-control" id="pl" disabled>
    				<label for="td" class="form-label">Text Description</label>
    				<input name="td" value="${pago.checkNumber}" type="text" class="form-control" id="td" >
    				<label for="hd" class="form-label">Html Description</label>
    				<input name="hd" value="${pago.date}" type="date" class="form-control" id="hd">

    				<input type="submit" value="Actualizar" class="btn btn-primary w-100 mt-5">
				</form>
			
			</div>
		</div>
		
	</div>
</body>
</html>