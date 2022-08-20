<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Employee</title>

</head>
<body>
	<table border="2px">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>City</th>
			<th>State</th>
			<th>Salary</th>
			<th>Grade</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.name}</td>
				<td>${employee.city}</td>
				<td>${employee.state}</td>
				<td>${employee.salary}</td>
				<td>${employee.grade}</td>
				<td><a href="delete?id=${employee.id }">delete</a></td>
				<td><a href="edit?id=${employee.id}">edit</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td><a href="register">create</a></td>
		</tr>
	</table>
</body>
</html>