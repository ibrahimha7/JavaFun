<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />
<title>Checkerboard</title>
</head>
<body><div class="container"><% int width=0; int height=0;
if(request.getParameter("width") != null){
	width = Integer.parseInt(request.getParameter("width"));	
}
if(request.getParameter("height") != null){
	height = Integer.parseInt(request.getParameter("height"));
} %>
	<h1>Checkerboard <%= width %>w X <%= height %>h</h1>
	<% for(int i=0; i<height; i++){
		if(i%2 == 0){%>
		<div class="roweven">
			<%for(int j=0; j<width; j++){
				if(j%2 == 0){%>
					<div class="one"></div>
				<%} else {%>
					<div class="two"></div>
				<%}
			}%>
			</div>
		<%} else{%>
			<div class="rowodd">
			<%for(int j=0; j<width; j++){
				if(j%2 == 0){%>
					<div class="one"></div>
				<%} else {%>
					<div class="two"></div>
				<%}
			}%>
			</div>
		<%} %>
	<%} %>
	</div>
</body>
</html>