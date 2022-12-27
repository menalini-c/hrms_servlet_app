<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.snipe.learning.hrmswebapp.domain.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<%
	User user = (User)session.getAttribute("user");
	if(user != null && user.getUser_type() != null){
		out.println("Welcome ...."+user.getUser_type());%></br><%
		if(user.getUser_type().equalsIgnoreCase("ADMIN")){%>
			<a href="manageemp.jsp">Manage Employee</a></br>
		    <a href="managedept.jsp">Manage Department</a></br>
		    <a href="managepaygrade.jsp">Manage Paygrade</a></br>
		<%}else {%>
			<a href="emphome.jsp">View MY Details</a>
		<%}
	}
	%>
	
</form>

</body>
</html>