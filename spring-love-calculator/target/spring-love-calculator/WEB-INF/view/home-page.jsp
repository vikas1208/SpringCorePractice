<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<script type="text/javascript">

	function validateUsername(){
		var uname= document.getElementById("yn").value		
		if(	uname.length < 1){
			alert("you should have atleast 1 char")
			return false
		}
		return true;	
	}
</script>

<title>HomePage</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<form:form action="process-homepage" method="get" modelAttribute="userInfo">
		<div align="center">
			<p>
				<label>Your Name:</label>
				 <form:input path= "userName" placeholder="Enter your name"/>
				 <form:errors path="userName" />
			</p>
			<p>
				<label>Crush Name:</label>
				 <form:input path="crushName" placeholder="Enter crush name"/>
			</p>
			<p>
			 	<form:checkbox path="termCondition" id="check" />
				<label>I accept that this is for fun</label>
				 <form:errors path="termCondition" />
			</p>
				<input type="submit" value="Submit">
		</div>
	</form:form>
</body>
</html>