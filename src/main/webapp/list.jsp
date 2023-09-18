<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.net.URL" %>
<%@ page import="com.example.bai2_jsp_jstl1.Member" %><%--
  Created by IntelliJ IDEA.
  User: titdzvl
  Date: 14/09/2023
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of customers</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
<h1 align="center" style="color: skyblue">Danh Sách Khách Hàng</h1>
<form method="post">
        <%
            List<Member> listMember = new ArrayList<>();
            listMember.add(new Member("Vũ Duy Khánh","14-02-2004","Hà Nội","https://scontent.fhan14-2.fna.fbcdn.net/v/t39.30808-6/278350136_3202481560034861_1126502291344656219_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=1b51e3&_nc_ohc=5LZqKJrGFJsAX-dyZd1&_nc_ht=scontent.fhan14-2.fna&oh=00_AfCo-hYFunb-HtxH_jVyNY1eGMkreQB4ucOd_BDR_C1Aiw&oe=6507E07E"));
            listMember.add(new Member("Vũ Duy Khánh","14-02-2004","Hà Nội","https://scontent.fhan14-2.fna.fbcdn.net/v/t39.30808-6/278350136_3202481560034861_1126502291344656219_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=1b51e3&_nc_ohc=5LZqKJrGFJsAX-dyZd1&_nc_ht=scontent.fhan14-2.fna&oh=00_AfCo-hYFunb-HtxH_jVyNY1eGMkreQB4ucOd_BDR_C1Aiw&oe=6507E07E"));
            listMember.add(new Member("Vũ Duy Khánh","14-02-2004","Hà Nội","https://scontent.fhan14-2.fna.fbcdn.net/v/t39.30808-6/278350136_3202481560034861_1126502291344656219_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=1b51e3&_nc_ohc=5LZqKJrGFJsAX-dyZd1&_nc_ht=scontent.fhan14-2.fna&oh=00_AfCo-hYFunb-HtxH_jVyNY1eGMkreQB4ucOd_BDR_C1Aiw&oe=6507E07E"));
            listMember.add(new Member("Vũ Duy Khánh","14-02-2004","Hà Nội","https://scontent.fhan14-2.fna.fbcdn.net/v/t39.30808-6/278350136_3202481560034861_1126502291344656219_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=1b51e3&_nc_ohc=5LZqKJrGFJsAX-dyZd1&_nc_ht=scontent.fhan14-2.fna&oh=00_AfCo-hYFunb-HtxH_jVyNY1eGMkreQB4ucOd_BDR_C1Aiw&oe=6507E07E"));
            request.setAttribute("listMember",listMember);
        %>
    <table class="table table-striped table-bordered">
        <tr>
            <th>Tên</th>
            <th>Ngày Sinh</th>
            <th>Địa Chỉ</th>
            <th>Ảnh</th>
        </tr>

        <c:forEach var="a" items="${listMember}">
            <tr>
                <td>${a.name}</td>
                <td>${a.birth}</td>
                <td>${a.address}</td>
                <td><img src="${a.image}" alt="Ảnh" width="30px" , height="30px"></td>;
            </tr>
        </c:forEach>

    </table>
</body>
</html>
