<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Details</title>
</head>
<body>
<h1>Your Registration is successful</h1>
<h3>The details entered by you are:</h3>
Name: ${dto.name} <br>
Username: ${dto.userName} <br>
Password: ${dto.password} <br>
Country: ${dto.country} <br>
Hobby: 
<c:forEach var="temp" items="${dto.hobby}">

	${temp} 
</c:forEach>
 <br>
Gender: ${dto.gender} <br>

</body>
</html>