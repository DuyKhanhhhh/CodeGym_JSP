<%--
  Created by IntelliJ IDEA.
  User: titdzvl
  Date: 13/09/2023
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="/calculate" method="post">
    <label>First operand: </label><br/>
    <input type="text" name="firstNumber" placeholder="Enter number..."/><br/>
    <label>Operator: </label><br/>
    <select name="operator"><br/>
        <option value="+">Addition</option>
        <option value="-">Subtraction</option>
        <option value="*">Multiplication</option>
        <option value="/">Division</option>
    </select><br/>
    <label>Second operand: </label><br/>
    <input type="text" name="secondNumber" placeholder="Enter number..."/><br/>
    <input type="submit" id="submit" value="Calculator">
</form>
</body>
</html>
