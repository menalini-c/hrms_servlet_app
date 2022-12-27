<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet" method="get">
	<h4><%out.println(request.getAttribute("errorMessage"));%></h4>
	<button type="submit">ok</button>
</form>
	
</body>
</html>