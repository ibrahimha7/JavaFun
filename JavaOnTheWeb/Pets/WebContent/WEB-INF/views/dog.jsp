<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h5>Your <c:out value="${dog.getBreed()}"/> Dog Name is <c:out value="${dog.getName()}"/> . <c:out value="${dog.showAffection()}"/>  </h5>


</body>
</html>