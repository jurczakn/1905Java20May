<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome <c:out value="${ user.getFullName() }"></c:out> to Your Homepage</h1>
	<a href="help">Help</a>\
	<a href="logout">Logout</a>
</body>
</html>