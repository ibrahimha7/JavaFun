<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookfiy|Add Song</title>
</head>
<body>
	<div style="margin: 100px">
		<a href="/dashboard">Dashboard</a>
		<h1>Add Song</h1>
		<form:form action="/songs/new" method="POST" modelAttribute="song">
			<div class="form-group">
				<form:label for="title" path="title">Title: 
				<form:input type="text" path="title" class="form-control" id="title"/>
				</form:label>
			</div>
			<div class="form-group">
				<form:label path="artist">Artist: 
				<form:input type="text" path="artist" class="form-control" id="artist"/>
				</form:label>
			</div>
			<div class="form-group">
				<form:label path="rating">Rating (1-10): 
				<form:input type="number" path="rating" min="1" max="10" class="form-control" id="rating"/>
				</form:label>
			</div>
			
				<input type="submit" value="Add Song" class="btn btn-default">
				
		</form:form>
		<% if(request.getAttribute("errors") != null){ %>
		<fieldset>
		<legend>Errors</legend>
		<c:forEach items="${errors}" var="error">
			<p><c:out value="${error.getDefaultMessage()}"/></p>
		</c:forEach>
		</fieldset>
		<% } %>

	</div>

</body>
</html>