<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: titdzvl
  Date: 18/09/2023
  Time: 09:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>Session Tracking</h1>
</center>
<form action="time.jsp">
    <table border="1" align="center">
        <tr bgcolor="#ffebcd">
            <td>Center Time</td>
            <td><%
                PrintWriter writer = response.getWriter();
                writer.println("createTime");%></td>
        </tr>
        <tr>
            <td>Time of Last Access</td>
            <td><% writer.println("lastAccessTime");%></td>
            </td>
        </tr>
        <tr>
            <td>User ID</td>
            <td><% writer.println("visitCount");%></td>
        </tr>
    </table>
</form>
</body>
</html>
