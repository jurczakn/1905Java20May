<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<c:if test="${error != null}">
	
		<div>
			<span> <Strong>Sorry - </Strong> ${ error } </span>
		</div>
	
	</c:if>

	<h2>Please log in:</h2>
	<form action="login" method="post">
		<input type="text" name="username" placeholder="Username"/>
		<br>
		<input type="password" name="password" placeholder="Password"/>
		<br>
		<input type="submit" value="login"/>
	</form>
</body>
</html>