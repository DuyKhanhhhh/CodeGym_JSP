package com.example.demo_tomcat;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/calculator")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("txt/html");
        String product = req.getParameter("Product");
        int price = Integer.parseInt(req.getParameter("Price"));
        double discount = Double.parseDouble(req.getParameter("Discount"));

        double discountAmount = price * discount * 0.01;

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1 >Product Description: " + product + "</h1>");
        printWriter.println("<h1>Discount Amount: " + discountAmount + "</h1>");
        printWriter.println("<h1>Discount Price: " + price + "</h1>");
        printWriter.println("</html>");
    }
}
