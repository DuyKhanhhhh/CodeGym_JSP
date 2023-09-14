<%--
  Created by IntelliJ IDEA.
  User: titdzvl
  Date: 11/09/2023
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Translate</title>
</head>
<body>
<h2>Dịch Tiếng Anh Sang Tiếng Việt</h2>
<form action="/translate" method="get">
    <input type="text" name="TxtSearch" placeholder="Enter your word: ">
    <input type="submit" id="submit" value="Search">
</form>
</body>
</html>
