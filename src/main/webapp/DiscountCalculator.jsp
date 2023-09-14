<%--
  Created by IntelliJ IDEA.
  User: titdzvl
  Date: 12/09/2023
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calculator" method="get">
    <label>Product Description:</label><br/>
    <input type="text"  name="Product" placeholder="Enter your Description: "></br>
    <label>List Price: </label><br/>
    <input type="text" name="Price" placeholder="0"></br>
    <label>Discount Percent: </label><br/>
    <input type="text" name="Discount" placeholder="0%"></br>
    <input type="submit" id="submit" value="Sum">
</form>
</body>
</html>
