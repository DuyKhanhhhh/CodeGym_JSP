<%--
  Created by IntelliJ IDEA.
  User: titdzvl
  Date: 08/09/2023
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style type="text/css">
    .login{
        height: 180px;
        width: 230px;
        margin: 0;
        padding: 10px;
        border: 1px skyblue;
    }
    .login input{
        padding: 5px;
        margin: 5px;
    }
</style>
<body>
<%--//action="/login : Đường dẫn mà from sẽ gửi dữ liệu đến--%>
<%--//method="post" : Các request sẽ gửi dữ liệu--%>
<form action="/login" method="get">
    <div class="login">
        <h2>Login</h2>
        <input type="text" name="username" size="30" placeholder="username"/>
        <input type="password" name="password" size="30" placeholder="password"/>
        <input type="submit" value="Sign in"/>
    </div>[

</form>
</body>
</html>
