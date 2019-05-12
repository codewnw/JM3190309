<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
	color: red
}
</style>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Person Form</title>
</head>
<body>
	<%@ include file="header.jsp"%>>
	<form:form action="process-person-form" modelAttribute="person"
		method="post">
		<div class="container">
			<table class="table table-striped">
				<thead class="thead-dark">
					<tr>
						<th scope="col" colspan="2" align="center">Person
							Registration Form</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row"><label>Name*</label></th>
						<td><form:input path="name" placeholder="Enter name" /> <form:errors
								path="name" cssClass="error" /></td>
					</tr>


					<tr>
						<th scope="row"><label>Age</label></th>
						<td><form:input path="age" placeholder="Enter age" /> <form:errors
								path="age" cssClass="error" /></td>
					</tr>

					<tr>
						<th scope="row"><input type="reset"
							class="btn btn-danger btn-block" value="Reset" /></th>
						<td><input type="submit" class="btn btn-success btn-block"
							value="Register" /></td>
					</tr>
				</tbody>
			</table>

		</div>
	</form:form>
</body>
</html>