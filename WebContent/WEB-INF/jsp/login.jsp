<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login...</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<div class="container">
		<form method="post" action="performLogin">
			<table>
				<tr>
					<td>Username</td>
					<td><input type="text" name="username"
						placeholder="Enter username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"
						placeholder="Enter password"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>