<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify|Song</title>
</head>
<body>
<div style="margin:100px">
	<a href="/dashboard">Dashboard</a> 
		<p>Title: <c:out value="${song.title}"/></p>
		<p>Artist: <c:out value="${song.artist}"/></p>
		<p>Rating (1-10): <c:out value="${song.rating}"/></p>
		<p><a href="/songs/delete/${song.id}">Delete</a></p>
</div>

</body>
</html>