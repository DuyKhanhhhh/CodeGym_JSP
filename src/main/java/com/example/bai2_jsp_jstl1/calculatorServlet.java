package com.example.bai2_jsp_jstl1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculatorServlet", urlPatterns = "/calculate")
public class calculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        float firstNumber = Float.parseFloat(req.getParameter("firstNumber"));
        float secondNumber = Float.parseFloat(req.getParameter("secondNumber"));
        char operator = req.getParameter("operator").charAt(0);
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result: </h1>");
        try {
            float result = Calculator.calculator(firstNumber,secondNumber,operator);
            writer.print(firstNumber + " " + operator + " " + secondNumber + " = " + result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        writer.println("</html>");
    }
}
