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
<div id="container">
		<h1>Welcome to the Great Number Game!</h1>
		<h2>I am thinking of a number between 1 and 100.</h2>
		<h2>Take a guess!</h2>
		<div id="indicator">
			<% String theResponse = (String) session.getAttribute("response");
				if(theResponse == "correct"){ %>
					<div id="correct">
						<h1 class="padding">CORRECT!</h1>
						<a href="reset"><button>Play Again?</button></a>
					</div>
			<% } else if(theResponse == "low"){%>
	
					<div id="low">
						<h1 class="padding" style="background-color:yellow">Too Low!</h1>
					</div>
			<% } else if(theResponse == "high"){ %>
					<div id="high">
						<h1 class="padding" style="background-color:red">Too High!</h1>
					</div>
			<% } %>
		</div>
		<form action="../Pets/Index" method="post">
			<p><input type="text" name="guess"></p>
			<p><input type="submit" value="Submit"></p>
		</form>	
	</div>
</body>
</html>