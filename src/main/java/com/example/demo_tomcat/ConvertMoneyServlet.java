package com.example.demo_tomcat;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConvertMoneyServlet", value = "/convert")
public class ConvertMoneyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Lấy giá trị từ ô input chuyển và gắn giá trị fload
        float rate = Float.parseFloat(req.getParameter("rate"));
        float usd = Float.parseFloat(req.getParameter("usd"));

        float vnd = rate * usd;

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>Rate: " + rate + "</h1>");
        printWriter.println("<h1>USD: " + usd + "</h1>");
        printWriter.println("<h1>VND: " + vnd + "</h1>");
        printWriter.println("</html>");
    }
}
