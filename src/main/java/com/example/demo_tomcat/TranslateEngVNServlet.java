package com.example.demo_tomcat;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="TranslateEngVNServlet", urlPatterns = "/translate")
public class TranslateEngVNServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin Chào");
        dictionary.put("how", "Thế Nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
        dictionary.put("what", "Là Gì");
        //Lấy giá trị
        String search = req.getParameter("TxtSearch");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        String result = dictionary.get(search);
        if (result != null) {
            writer.println("Word: " + search + "</br>");
            writer.println("Result: " + result);
        }else {
            writer.println("Not found");
        }
        writer.println("</html>");
    }
}
