<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Trainee Details</h1>
<form action="save" method="post">
<table>

<tr><td>Trainee Id:</td><td><input type="text" name="traineeId"/></tr>
<tr><td>Trainee Name:</td><td><input type="text" name="traineeName"/></td></tr>
<tr><td>Trainee Location:</td><td><input type="radio" name="traineeLocation" value="Chennai"/>Chennai
<input type="radio" name="traineeLocation" value="Banglore"/>Banglore
<input type="radio" name="traineeLocation" value="Pune"/>Pune
<input type="radio" name="traineeLocation" value="Mumbai"/>Mumbai


</td>
</tr>
<tr><td>Trainee Domain:</td><td><select name="traineeDomain">
<option value="java">Java</option>
<option value="python">Python</option>
<option value=".Net">.Net</option>
</select></tr>
<tr><td><input type="submit"  name="submit" value="Add Trainer"/></td></tr>

</table>
</form>
</body>
</html>