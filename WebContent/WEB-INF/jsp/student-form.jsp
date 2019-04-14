<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<h1>Student Form !!!</h1>
	<form:form action="process-student-form" modelAttribute="student" method="post">
		<form:input path="firstName" placeholder="Enter first name" /><br /> 
		<form:input path="lastName" placeholder="Enter last name" /><br /> 
		<form:input path="age" placeholder="Enter age" /><br /> 
		<input type="submit" value="Register" />
	</form:form>
</body>
</html>