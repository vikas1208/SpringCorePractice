<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Cafe</title>
</head>
<body>
	<h1 align="center">VIKAS CAFE</h1>
	<form action="processOrder" method="get">
		<div align="center">
			<label for="item_name">Item Name:</label> 
			<input type="text" name="foodType" placeholder="Enter your item..." id="item_name" /><br> <br>
			<input type="submit" value="Order" />
		</div>
	</form>
</body>
</html>