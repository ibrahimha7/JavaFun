<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div style="margin: 100px">

		<h1>
			<c:out value="${person.first_name} ${person.last_name}" />
		</h1>
		<ul>
			<li>License Number: <c:out value="${person.license.number}" /></li>
			<li>State: <c:out value="${person.license.state}" /></li>
			<li>Expiration Date: <fmt:formatDate
					value="${person.license.expiration_date}" pattern="MM-dd-yyyy" /></li>
			<li><a href="/persons/${person.id}/delete">Delete</a></li>
		</ul>

	</div>

</body>
</html>