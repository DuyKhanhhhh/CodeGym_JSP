<%--
  Created by IntelliJ IDEA.
  User: titdzvl
  Date: 18/09/2023
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    #box{
        width: 1000px;
        height: 800px;
        padding: 30px 0px 200px 200px;
    }
    td{
        font-size: 20px;
    }
    img{
        width: 120px;
        height: 100px;
    }

</style>
<head>
    <title>Sản Phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<h2 align="center" style="color: #ff7171">Danh Sách Sản Phẩm</h2>
    <table class="table table-striped" id="box">
        <tr align="center">
            <td><h1 >Product</h1></td>
            <td><h1>Price</h1></td>
            <td><h1>Img</h1></td>
            <td><h1>Select</h1></td>
        </tr>
        <tr align="center">
            <td>Socola</td>
            <td>100$</td>
            <td><img src="https://allimages.sgp1.digitaloceanspaces.com/tipeduvn/2022/08/1661074057_908_Top-nhung-hinh-anh-Socola-dep-ngot-ngao-nhat-the.jpg"></td>
            <td><a href="socola.jsp">ADD</a></td>
        </tr>
        <tr align="center">
            <td>Bim Bim</td>
            <td>10$</td>
            <td><img src="https://i.ytimg.com/vi/OdYw5PMrS7I/maxresdefault.jpg" width="40" height="40"></td>
            <td><a href="bimbim.jsp">ADD</a></td>
        </tr>
        <tr align="center">
            <td>Kem</td>
            <td>20$</td>
            <td><img src="https://t0.gstatic.com/licensed-image?q=tbn:ANd9GcSRA1VvVWshDqdk-IbClyNwWoUAjMnFQ5KQLb8eH0hu4gCCvfvqMEcQqOF-CTro2maW"></td>
            <td><a href="kem.jsp">ADD</a></td>
        </tr>
        <tr align="center">
            <td>Cocacola</td>
            <td>15$</td>
            <td><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCQMt4qUjROBLwwCnT8oH5KFABRgi6fF61nA&usqp=CAU"></td>
            <td><a href="cocacola.jsp">ADD</a></td>
        </tr>
    </table>

</body>
</html>
