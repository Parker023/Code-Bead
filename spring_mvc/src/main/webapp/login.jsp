<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="savestudent" modelAttribute="student">

		<form:label path="name">Name:</form:label>
		<form:input path="name" />

		<form:label path="std">Class:</form:label>
		<form:input path="std" />

		<form:label path="school">School:</form:label>
		<form:input path="school" />

		<input type="submit" value="save">

	</form:form>

</body>
</html>