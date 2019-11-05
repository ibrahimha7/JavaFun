<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date</title>
</head>
<body>

	<a href="/">Back</a>
	<br>
	<span id="date"><fmt:formatDate value="${date}"
			pattern="EEEE, 'the' d 'of' MMMM, yyyy" /></span>

</body>
</html>