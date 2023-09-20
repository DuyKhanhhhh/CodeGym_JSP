<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: titdzvl
  Date: 18/09/2023
  Time: 08:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<h1>Display the session value on this page</h1>
<%
    String name = (String) session.getAttribute("name");
    PrintWriter writer = response.getWriter();
    writer.println("Heloo" + name);
%>
</body>
</html>
