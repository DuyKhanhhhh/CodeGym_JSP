<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login form<</title>
</head>
<body>
<h1>Login from</h1>
<label>UserName: </label>
<form action="/login" method="post">
    <input type="text" name="username" placeholder="Enter your name...">
    <label>UserName: </label>
    <input type="password" name="password" placeholder="Enter your password...">
    <input type="submit" value="Submit">
</form>
</body>
</html>