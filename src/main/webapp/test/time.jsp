<%@ page import="java.util.Date" %><%--
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
<%
    //Lấy thời gian tạo session
    Date createTime = new Date(session.getCreationTime());
    //Lấy thời gian kết thức session
    Date lastAccessTime = new Date(session.getLastAccessedTime());

    String title = "Welcome Back to my website";
    Integer visitCount = new Integer(0);
    String visitCountKey = new String("visitCount");
    String userIDKey = new String("userID");
    String userID = new String("ABCD");

    if (session.isNew()){
        title = "Welcome to my website";
        session.setAttribute(userIDKey,userID);
        session.setAttribute(visitCountKey,visitCount);
    }
    visitCount = (Integer) session.getAttribute(visitCountKey);
    visitCount = visitCount + 1;
    userID = (String) session.getAttribute(userIDKey);
    session.setAttribute(visitCountKey,visitCount);
    response.sendRedirect();
%>
</body>
</html>
