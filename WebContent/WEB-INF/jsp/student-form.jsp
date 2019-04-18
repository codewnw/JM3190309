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
		<label>First Name: </label><form:input path="firstName" placeholder="Enter first name" /><br /> 
		<label>Last Name: </label><form:input path="lastName" placeholder="Enter last name" /><br /> 
		<label>Age: </label><form:input path="age" placeholder="Enter age" /><br /> 
		<label>Gender: </label>
		Male: <form:radiobutton path="gender" value="Male"/>
		Female: <form:radiobutton path="gender" value="Female"/>
		<br />
		<label>Country: </label>
		<form:select path="country">
		<form:option value="" label="--Select--" />
		<form:option value="IND" label="India" />
		<form:option value="AUS" label="Australia" />
		<form:option value="SCT" label="Scottland" />
		</form:select>
		<br />
		
		<label>Courses: </label>
		<label>Java Model 1</label>
		<form:checkbox path="courses" value="Core Java" />
		<label>Java Model 2</label>&nbsp;
		<form:checkbox path="courses" value="Advance Java" />
		<label>Java Model 3</label>&nbsp;
		<form:checkbox path="courses" value="Java Frameworks" />
		<br />
		
		<label>Are you graduate?</label>&nbsp;
		<form:checkbox path="graduate" />
		<br />
		
		<label>Comment:</label>&nbsp;
		<form:textarea path="comment" cols="40" rows="5"></form:textarea>
		<br />
		<input type="submit" value="Register" />
	</form:form>
</body>
</html>