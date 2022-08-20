<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee</title>
</head>
<body>
	<form:form action="editemployee" modelAttribute="employee">
		<form:label path="id">ID:</form:label>
		<form:input path="id" readonly="true" />
		<br>
		<form:label path="name">Name:</form:label>
		<form:input path="name" />
		<br>
		<form:label path="city">City:</form:label>
		<form:input path="city" />
		<br>
		<form:label path="state">State:</form:label>
		<form:input path="state" />
		<br>
		<form:label path="salary">Salary:</form:label>
		<form:input path="salary" />
		<br>
		<form:label path="grade">Grade:</form:label>
		<form:input path="grade" readonly="true" />
		<br>
		<input type="submit" value="update">

	</form:form>
</body>
</html>