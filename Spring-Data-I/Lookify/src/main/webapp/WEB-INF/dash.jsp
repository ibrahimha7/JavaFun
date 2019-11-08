<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookfiy|Dashboard</title>
</head>
<body>
	<div style="margin: 100px">
		<a href="/songs/new">Add New</a> | <a href="/songs/top">Top Songs</a> 
		<form action="/search" method="post">
			<input type="search" name="artist" placeholder="artist">
			<input type="submit" value="Search Artists">
		</form>
		<table class="table table-striped table-hover table-bordered">
		<thead>
			<tr>
				<th>Title</th>
				<th>Rating</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${songs}" var="song">
    			<tr>    
   				<td><a href="/songs/${song.id}"><c:out value="${song.title}"/></a></td>
    				<td><c:out value="${song.rating}"/></td>
    				<td><a href="/songs/delete/${song.id}">Delete</a></td>
    			</tr>
			</c:forEach>
		</tbody>
		</table>

	</div>
</body>
</html>