<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/main.css">
<title>Survey Results</title>
</head>
<body>
	<div style="border:2px solid black; margin:100px">
		<h2>Submitted Info</h2>
		
		<h2 >Name: <c:out value="${name}"/></h2>
		<h2 >Dojo Location: <c:out value="${location}"/></h2>
		<h2 >Favorite Language: <c:out value="${language}"/></h2>
		<h2 >Comment: <c:out value="${comment}"/></h2>
	</div>
</body>
</html>