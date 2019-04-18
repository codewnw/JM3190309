<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="process-student-form" modelAttribute="student"
		method="post">
		<div class="container">
			<table class="table table-striped">
				<thead class="thead-dark">
					<tr>
						<th scope="col" colspan="2" align="center">Student Registration Form</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row"><label>First Name</label></th>
						<td><form:input path="firstName"
								placeholder="Enter first name" /></td>
					</tr>
					<tr>
						<th scope="row"><label>Last Name</label></th>
						<td><form:input path="lastName" placeholder="Enter last name" /></td>
					</tr>
					<tr>
						<th scope="row"><label>Age</label></th>
						<td><form:input path="age" placeholder="Enter age" /></td>
					</tr>
					<tr>
						<th scope="row"><label>Gender</label></th>
						<td>Male: <form:radiobutton path="gender" value="Male" />
							Female: <form:radiobutton path="gender" value="Female" /></td>
					</tr>
					<tr>
						<th scope="row"><label>Country</label></th>
						<td><form:select path="country">
								<form:option value="" label="--Select--" />
								<form:option value="IND" label="India" />
								<form:option value="AUS" label="Australia" />
								<form:option value="SCT" label="Scottland" />
							</form:select></td>
					</tr>
					<tr>
						<th scope="row"><label>Courses</label></th>
						<td><label>Java Model 1</label> <form:checkbox path="courses"
								value="Core Java" /> <label>Java Model 2</label>&nbsp; <form:checkbox
								path="courses" value="Advance Java" /> <label>Java
								Model 3</label>&nbsp; <form:checkbox path="courses"
								value="Java Frameworks" /></td>
					</tr>
					<tr>
						<th scope="row"><label>Are you graduate?</label></th>
						<td><form:checkbox path="graduate" /></td>
					</tr>
					<tr>
						<th scope="row"><label>Comment</label></th>
						<td><form:textarea path="comment" cols="40" rows="2"></form:textarea></td>
					</tr>
					<tr>
						<th scope="row"><input type="reset" class="btn btn-danger btn-block" value="Reset" /></th>
						<td><input type="submit"  class="btn btn-success btn-block" value="Register" /></td>
					</tr>
				</tbody>
			</table>

		</div>
	</form:form>
</body>
</html>