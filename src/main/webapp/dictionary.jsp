<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: titdzvl
  Date: 13/09/2023
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%
  Map<String,String> dic = new HashMap<>();
%>
<%
  dic.put("hello", "Xin chào");
  dic.put("how", "Thế nào");
  dic.put("book", "Quyển vở");
  dic.put("computer", "Máy tính");
  String search = request.getParameter("search");
  String result = dic.get(search);
%>
<%
  if (result != null){
%>
<h1>Word: <%=search%></h1>
<h1>Result: <%=result%></h1>
<%
  }else {
%>
<h1>Not fount</h1>
<%
  }
%>
</body>
</html>
