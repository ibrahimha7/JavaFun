<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div style="margin: 100px">

		<h1>Licenses</h1>
		<a href="/persons/new">Add Person</a> | <a href="/licenses/new">Add License</a>
		<table class="table table-striped table-hover table-bordered">
		<thead>
			<tr>
				<th>Name</th>
				<th>ID</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${persons}" var="person">
    			<tr>    
   				<td><a href="/persons/${person.id}"><c:out value="${person.first_name} ${person.last_name}"/></a></td>
    				<td><c:out value="${person.id}"/></td>
    			</tr>
			</c:forEach>
		</tbody>
		</table>
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