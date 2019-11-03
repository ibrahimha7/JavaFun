<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cat</title>
</head>
<body>

<h5>Your <c:out value="${cat.getBreed()}"/> Cats Name is <c:out value="${cat.getName()}"/> . <c:out value="${cat.showAffection()}"/>  </h5>


</body>
</html>