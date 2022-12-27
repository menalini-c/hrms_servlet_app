<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "java.util.List, java.util.ArrayList, com.snipe.learning.hrmswebapp.domain.Employee"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<%
	List<Employee> employeeRecords = (List<Employee>)session.getAttribute("employeeRecords");
	out.println(employeeRecords);
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
    	<c:forEach items="${employeeRecords}" var="employee">
        	<tr>
            	<td>Employee ID: <c:out value="${employee.emp_No}"/></td>
            	<td>First Name: <c:out value="${employee.first_Name}"/></td>
            	<td>Second Name: <c:out value="${employee.second_Name}"/></td>
            	<td>gender: <c:out value="${employee.gender}"/></td>
            	<td>designation: <c:out value="${employee.designation}"/></td>
            	<td>contact_No: <c:out value="${employee.contact_No}"/></td>
            	<td>designation: <c:out value="${employee.designation}"/></td>
            	<td>email_Id: <c:out value="${employee. email_Id}"/></td>
            	<td>hire_Date: <c:out value="${employee.hire_Date}"/></td>
            	<td>pan_No: <c:out value="${employee.pan_No}"/></td>
        	</tr>
    	</c:forEach>
	</table>
</body>
</html>