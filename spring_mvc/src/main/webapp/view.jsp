<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saved</title>
</head>
<body bgcolor="orange">
	<table border="2px">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>School</th>
			<th>Std</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
		<c:forEach items="${students}" var="student">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.school}</td>
				<td>${student.std}</td>
				<td><a href="delete?id=${student.id }">delete</a></td>
				<td><a href="edit?id=${student.id }">edit</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>