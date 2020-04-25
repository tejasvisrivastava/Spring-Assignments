<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>${msg }</p>
<h1>Trainee Details</h1>
<form action="retrieve" method="get">
<input type="text" name="traineeId" placeholder="Enter ID"/>
<input type="submit" name="s" value="Search"/>
</form>
</body>
</html>