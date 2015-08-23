<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container">
	<div class="row">
		
		<div class="col-sm-5">

			<c:url value="/" var="homeUrl"/>
			<a href="${homeUrl }">Home</a> <br>

			
			<h2>Edit pizza</h2>
			
			<form class="form-group" action="admin/pizza/edit" method="post">
				
				Name: <input class="form-control" type="text" name="name" value="${pizza.name }"> <br>
				Price: <input class="form-control" type="text" name="price" value="${pizza.price }"> <br>
				<input type="hidden" name="id" value="${pizza.id }">
				
				<button class="btn btn-default" type="submit">Edit</button>
				
				<c:url value="/admin/pizza" var="pizzasUrl"/>
				<a href="${pizzasUrl }" class="btn btn-default">Back</a>
			</form>

		</div>
	
	</div>

</div>

</body>
</html>