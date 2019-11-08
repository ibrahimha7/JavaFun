<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify|Top Songs</title>
</head>
<body>

<div style="margin:100px">
	<h1>Top Ten Songs</h1>
		<a href="/dashboard">Dashboard</a> 
		<ul>
			<c:forEach items="${songs}" var="song">
				<li>
					<c:out value="${song.rating}"/> - <a href="/songs/${song.id}"><c:out value="${song.title}"/></a> - <c:out value="${song.artist}"/>
				</li>
			</c:forEach>
		</ul>
</div>

</body>
</html>