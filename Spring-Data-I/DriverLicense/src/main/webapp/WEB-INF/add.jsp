<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Person</title>
</head>
<body>

	<div style="margin: 100px">

		<h1>New Person</h1>
		<form:form action="/persons/new" method="POST" modelAttribute="person">
			<form:label path="first_name">First Name: 
				<form:input type="text" path="first_name"/>
			</form:label>
			<form:label path="last_name">Last Name: 
				<form:input type="text" path="last_name"/>
			</form:label>
			<input type="submit" value="Create">
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