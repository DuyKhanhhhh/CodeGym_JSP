package com.example.b3_jsp_jst2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "productServlet", value = "/product")
public class productServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> product = new ArrayList<>();
        product.add(new Product("Socola",100,"https://allimages.sgp1.digitaloceanspaces.com/tipeduvn/2022/08/1661074057_908_Top-nhung-hinh-anh-Socola-dep-ngot-ngao-nhat-the.jpg"));
        product.add(new Product("Bim Bim",10,"https://i.ytimg.com/vi/OdYw5PMrS7I/maxresdefault.jpg"));
        product.add(new Product("Kem",15,"https://t0.gstatic.com/licensed-image?q=tbn:ANd9GcSRA1VvVWshDqdk-IbClyNwWoUAjMnFQ5KQLb8eH0hu4gCCvfvqMEcQqOF-CTro2maW"));
        product.add(new Product("Cocacola",12,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCQMt4qUjROBLwwCnT8oH5KFABRgi6fF61nA&usqp=CAU"));
        req.setAttribute("product", product);
        req.getRequestDispatcher("");
    }
}
