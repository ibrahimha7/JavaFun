<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Code</title>
</head>
<body>


<p style="color:red"> <c:out value="${ error }"/> </p>
<form method="POST" action="/try">
    
    <h4>What is the code?</h4>
    <input type="text" name="code">
    <button>Try Code</button>
</form>


</body>
</html>