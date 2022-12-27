<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "java.util.List, java.util.ArrayList, com.snipe.learning.hrmswebapp.domain.Employee"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<%
	List<Employee> employeeRecords = (List<Employee>)session.getAttribute("employeeRecords");
	//out.println(employeeRecords);
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Employee Details</h3>
	<hr size="4" color="gray"/>
	<table>
		<%for(Employee employee : employeeRecords){%>
			<tr>
    		
        		<td>Employee ID: <%= employee.getEmp_No()%></td>
        		<td>First Name: <%= employee.getFirst_Name()%></td>
        		<td>Second Name: <%= employee.getSecond_Name()%></td>
        		<td>gender: <%= employee.getGender()%></td>
        		<td>designation: <%= employee.getDesignation()%></td>
        		<td>contact_No: <%= employee.getContact_No()%></td>
        		<td>designation: <%= employee.getDesignation()%></td>
        		<td>email_Id: <%= employee.getEmail_Id()%></td>
        		<td>hire_Date: <%= employee.getHire_Date()%></td>
        		<td>pan_No: <%= employee.getPan_No()%></td>
    		</tr>
		<%}
		%>
	</table>
</body>
</html>