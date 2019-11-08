<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add License</title>
</head>
<body>

	<div style="margin: 100px">

		<h1>New License</h1>
		<form:form action="/licenses/new" method="POST" modelAttribute="license">
			<form:label path="person">Person:
				<form:select path="person">
					<c:forEach items="${persons}" var="person">
        					<form:option value="${person.id}"><c:out value="${person.first_name} ${person.last_name}"/></form:option>
   					</c:forEach>
				</form:select>
			</form:label>
			<form:label path="state">State: 
				<form:input type="text" path="state"/>
			</form:label>
			<form:label path="expiration_date">Expiration Date: 
				<form:errors path="expiration_date"/>
				<form:input type="date" path="expiration_date"/>
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