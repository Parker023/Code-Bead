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
	<form:form action="deletestudent">
		<form:label path="id">ID:</form:label>
		<form:input path="id" />
		<input type="submit" value="delete">
	</form:form>
</body>
</html>