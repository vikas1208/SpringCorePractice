 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Love Calculator</h1>
<h3 align="center">Please Register here</h3>
<form:form action="registration-success" method="get" modelAttribute="userReg" >
	<div align="center">
	    <p>
	    	<label>Name:</label>
	    	<form:input type="text" path="name" />
	    </p>
	    <p>
	    	<label>Username:</label>
	    	<form:input type="text" path="userName"/>
	    </p>
	    <p>
	    	<label >Password:</label>
	    	<form:password path="password" />
	    </p>
	    <p>
	    	<label>Country:</label>
	    	<form:select path="country">
	    		<form:option value="Ind" label="India"></form:option>
	    		<form:option value="USA" label="United States"></form:option>
	    		<form:option value="Pak" label="Pakistan"></form:option>
	    		<form:option value="SL" label="SriLanka"></form:option>
	    	</form:select>	
	    </p>
	      <p>
	    	<label>Hobbies:</label>
	    	Cricket: <form:checkbox path="hobby" value="Cricket"/>
	    	Hockey: <form:checkbox path="hobby" value="Hockey"/>
	    	Reading: <form:checkbox path="hobby" value="Reading"/>
	    	Travel: <form:checkbox path="hobby" value="Travel"/>
	    </p>
	      <p>
	    	<label for="gender">Gender:</label>
	    	Male:<form:radiobutton path="gender" value="male"/>
	    	Female:<form:radiobutton path="gender" value="female"/>
	    </p><br>
	    
	    <input type="submit" value=Register>
    </div>
  </form:form>  
	 
</body>
</html>