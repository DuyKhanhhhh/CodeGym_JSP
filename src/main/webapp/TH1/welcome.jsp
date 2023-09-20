<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: titdzvl
  Date: 18/09/2023
  Time: 08:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<%
  String name = request.getParameter("name");
  PrintWriter writer = response.getWriter();
  writer.println("Welcome: " + name);
  session.setAttribute("name", name);
%>
<a href="second.jsp">Display the value</a>
</body>
</html>
