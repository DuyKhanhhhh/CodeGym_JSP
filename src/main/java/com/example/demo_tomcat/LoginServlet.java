package com.example.demo_tomcat;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //request.getParameter() được sử dụng để lấy tham số được đẩy lên từ form.
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        if ("admin".equals(username)&& "admin".equals(password)){
            writer.println("<h1>Welcome " + username + "to website</h1>" );
        }else {
            writer.println("<h1>Login Error</h1>" );
        }
        writer.println("</html>");
    }
}
