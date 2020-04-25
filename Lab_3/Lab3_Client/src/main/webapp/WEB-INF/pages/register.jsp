<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NewProduct</title>
</head>
<body>
<div style="width:1000px;height:900px;margin-left;">

<form action="addProduct" method="post">
<h1 > Add New Product</h1>
<input type="text" name="id" placeholder="Product id"/>
<br><br>
<input type="text" name="name" placeholder="Product Name"/>
<br><br>
<input type="text" name="price" placeholder="Product Price"/>
<br><br>
<br>
<input type="submit" name="s" value="AddProduct"/>
</form>
<p style ="color:blue;background-color:red;">${ msg}</p>
</div>
</body>
</html>