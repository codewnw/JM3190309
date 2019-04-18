<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Profile</title>
</head>
<body>
<h1>Student Profile</h1>
First Name: ${student.firstName} <br />
Last Name: ${student.lastName} <br />
Age: ${student.age} <br />
Gender: ${student.gender} <br />
Country: ${student.country} <br />
Courses: ${student.courses[0]}, &nbsp; ${student.courses[1]}, &nbsp; ${student.courses[2]}<br />
Graduate: ${student.graduate} <br />
Comment: ${student.comment} <br />
</body>
</html>